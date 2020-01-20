package com.chenss.jwtshiro.model;

/**
 * @ClassName SysUser
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 3:50 PM
 * @Version 1.0
 **/
public class SysUser {
    private String userName;

    private String pwd;

    private String niceName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", niceName='" + niceName + '\'' +
                '}';
    }
}
