package com.chenss.jwtshiro.model;

/**
 * @ClassName SysResource
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 4:05 PM
 * @Version 1.0
 **/
public class SysResource {

    private String perms;

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    @Override
    public String toString() {
        return "SysResource{" +
                "perms='" + perms + '\'' +
                '}';
    }
}
