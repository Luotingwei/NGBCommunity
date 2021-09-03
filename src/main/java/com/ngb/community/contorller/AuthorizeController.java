package com.ngb.community.contorller;

import com.ngb.community.dto.AccessTokenDto;
import com.ngb.community.dto.GithubUser;
import com.ngb.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenDto accessTokenDto = new AccessTokenDto();
        accessTokenDto.setCode(code);
        accessTokenDto.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDto.setClient_id("2fb1b0093eed308a2acc");
        accessTokenDto.setClient_secret("ebe0f19efbbbae879f4f6d76fb44c4d452beb758");
        String access_token = githubProvider.getAccessToken(accessTokenDto);
        GithubUser user = githubProvider.getUser(access_token);
        System.out.println(user.getName());
        return "index";
    }


}
