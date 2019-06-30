package com.springboot.demo.service;

import com.springboot.demo.entity.User;
import com.springboot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserService
 * Package:com.springboot.demo.service
 * Description:
 *
 * @date:2019/6/30 0030 16:25
 * @author:ysrjdf
 */
@Service
public class UserService  implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if (user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }
}
