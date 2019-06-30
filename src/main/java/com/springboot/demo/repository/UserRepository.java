package com.springboot.demo.repository;

import com.springboot.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ClassName:UserRepository
 * Package:com.springboot.demo.repository
 * Description:
 *
 * @date:2019/6/30 0030 16:25
 * @author:ysrjdf
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}
