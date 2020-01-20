package com.chenss.jwtshiro.service;

import com.chenss.jwtshiro.model.SysResource;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SysResourceService
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 4:05 PM
 * @Version 1.0
 **/
@Service
public class SysResourceService {
    public List<SysResource> findResourceByUserName(String username) {
        List list = new ArrayList();

        SysResource s =  new SysResource();
        s.setPerms("sys:role:save");

        SysResource s1 =  new SysResource();
        s1.setPerms("sys:role:update");

        list.add(s);
        list.add(s1);

        return list;
    }

//    @PutMapping("/saveOrUpdate")
//    @ApiOperation("保存或更新角色")
//    @RequiresPermissions({"sys:role:save", "sys:role:update"})
//    public void saveOrUpdate(SysRoleVoForSave sysRoleVoForSave) {
//        sysRoleService.saveOrUpdate(sysRoleVoForSave);
//    }
}
