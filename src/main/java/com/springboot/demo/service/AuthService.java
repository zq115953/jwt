package com.springboot.demo.service;

import com.springboot.demo.entity.User;

/**
 * ClassName:AuthService
 * Package:com.springboot.demo.service
 * Description:
 *
 * @date:2019/6/30 0030 16:30
 * @author:ysrjdf
 */

public interface AuthService {
    User register(User userToAdd );
    String login( String username, String password );
}
