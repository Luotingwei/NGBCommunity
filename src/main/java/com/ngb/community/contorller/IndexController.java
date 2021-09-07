package com.ngb.community.contorller;

import com.ngb.community.mapper.UserMapper;
import com.ngb.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if ("token".equals(c.getName())) {
                String userToken = c.getValue();
                User user = userMapper.findByToken(userToken);
                if (user != null) {
                    request.getSession().setAttribute("githubUser", user);
                }
                break;
            }
        }
        return "index";
    }
}