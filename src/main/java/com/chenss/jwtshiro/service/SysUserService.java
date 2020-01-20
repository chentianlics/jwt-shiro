package com.chenss.jwtshiro.service;

import com.chenss.jwtshiro.model.SysUser;
import org.springframework.stereotype.Service;

/**
 * @ClassName SysUserService
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 3:49 PM
 * @Version 1.0
 **/
@Service
public class SysUserService {

    public SysUser findByUserName(String username) {
        SysUser sysUser = new SysUser();
        sysUser.setUserName("ctl");
        sysUser.setPwd("123");
        return sysUser;
    }
}
