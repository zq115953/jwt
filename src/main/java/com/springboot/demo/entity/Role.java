package com.springboot.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * ClassName:Role
 * Package:com.springboot.demo.entity
 * Description:
 *
 * @date:2019/6/30 0030 16:03
 * @author:ysrjdf
 */
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
