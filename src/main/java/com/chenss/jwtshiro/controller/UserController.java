package com.chenss.jwtshiro.controller;

import com.chenss.jwtshiro.model.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 4:13 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
@Api(tags = "user接口")
public class UserController {

    @PutMapping("/save")
    @ApiOperation("保存")
    @RequiresPermissions({"sys:role:save"})
    public String save(SysUser s) {
        //sysRoleService.saveOrUpdate(sysRoleVoForSave);
         return "sys:role:save";
    }

    @PutMapping("/update")
    @ApiOperation("更新")
    @RequiresPermissions({"sys:role:update"})
    public String update(SysUser s) {
        return "sys:role:update";
    }

    @PutMapping("/get")
    @ApiOperation("更新")
    @RequiresPermissions({"sys:role:get"})
    public String get(SysUser s) {
        return "sys:role:get";
    }
}
