package com.chenss.jwtshiro.realm;



import com.chenss.jwtshiro.model.JwtToken;
import com.chenss.jwtshiro.model.SysResource;
import com.chenss.jwtshiro.model.SysUser;
import com.chenss.jwtshiro.service.SysResourceService;
import com.chenss.jwtshiro.service.SysUserService;
import com.chenss.jwtshiro.util.JwtUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName MyRealm
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 3:43 PM
 * @Version 1.0
 **/
@Component
@SuppressWarnings("all")
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysResourceService sysResourceService;


    /**
     * 必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JwtUtil.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token无效");
        }

        SysUser userBean = sysUserService.findByUserName(username);
        if (userBean == null) {
            throw new AuthenticationException("用户不存在!");
        }

        if (!JwtUtil.verify(token, username, userBean.getPwd())) {
            throw new AuthenticationException("用户名或密码错误");
        }

        return new SimpleAuthenticationInfo(token, token, "my_realm");
    }

    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        String username = JwtUtil.getUsername(principals.toString());
        //根据用户名查询权限
        List<SysResource> resourceList = sysResourceService.findResourceByUserName(username);
        resourceList.parallelStream().forEach(sysResource -> {
            simpleAuthorizationInfo.addStringPermission(sysResource.getPerms());
        });
        return simpleAuthorizationInfo;
    }
}