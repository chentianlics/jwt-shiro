package com.chenss.jwtshiro.model;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @ClassName JwtToken 实现shiro的AuthenticationToken接口
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 3:36 PM
 * @Version 1.0
 **/
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}

