## NGB社区

https://github.com/Luotingwei/NGBCommunity GitHub仓库地址

## 参考资料

https://spring.io/guides Spring 官方文档

https://elasticsearch.cn/ 参考地址

https://v3.bootcss.com/ bootstrap 中文文档

https://docs.github.com/en GitHub API文档

https://square.github.io/okhttp Okhttp官网

https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/ mybatis集成spring boot 说明文档

https://www.h2database.com/html/main.html h2数据库官网

https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#features.sql.datasource.embedded Spring Boot 文档

## 使用工具

https://git-scm.com/download git下载地址

https://www.visual-paradigm.com/ 时序图作图软件

https://mvnrepository.com/ maven仓库

## 脚本

```sql
create table USER
(
    ID           INT auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);
```