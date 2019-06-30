package com.springboot.demo.controller;

import com.springboot.demo.entity.User;
import com.springboot.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.AuthenticationException;

/**
 * ClassName:JwtAuthController
 * Package:com.springboot.demo.controller
 * Description:
 *
 * @date:2019/6/30 0030 16:34
 * @author:ysrjdf
 */

public class JwtAuthController {
    @Autowired
    private AuthService authService;

    // 登录
    @RequestMapping(value = "/authentication/login", method = RequestMethod.POST)
    public String createToken( String username,String password ) throws AuthenticationException {
        return authService.login( username, password );
    }

    // 注册
    @RequestMapping(value = "/authentication/register", method = RequestMethod.POST)
    public User register(@RequestBody User addedUser ) throws AuthenticationException {
        return authService.register(addedUser);
    }
}
