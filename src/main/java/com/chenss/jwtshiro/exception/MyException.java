package com.chenss.jwtshiro.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName MyException
 * @Description TODO
 * @Auther chenss
 * @Date 2020/1/20 5:50 PM
 * @Version 1.0
 **/
@ControllerAdvice
public class MyException {
    @ExceptionHandler(value = AuthorizationException.class)
    public void defaultErrorHandler(HttpServletRequest req, HttpServletResponse resp, Exception e) throws Exception{
        resp.sendRedirect("/unauthorized");
    }

}
