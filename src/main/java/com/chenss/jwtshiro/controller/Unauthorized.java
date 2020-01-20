package com.chenss.jwtshiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Unauthorized
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 5:49 PM
 * @Version 1.0
 **/
@RestController

public class Unauthorized {

    @GetMapping("/unauthorized")
    public String noPerm() {
        return "抱歉！没有足够权限";
    }
}
