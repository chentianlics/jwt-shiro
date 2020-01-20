package com.chenss.jwtshiro.controller;

import com.chenss.jwtshiro.model.SysUser;
import com.chenss.jwtshiro.util.JwtUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 3:57 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/login")
@Api(tags = "登录接口")
public class LoginController {

    @PostMapping("/login")
    public Object login(@RequestBody SysUser sysUser){

        String sign = JwtUtil.sign(sysUser.getUserName(), sysUser.getPwd());

        return sign;
    }
}
