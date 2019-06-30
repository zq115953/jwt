package com.springboot.demo.controller;

import com.springboot.demo.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:LoggingTestController
 * Package:com.springboot.demo.controller
 * Description:
 *
 * @date:2019/6/30 0030 15:41
 * @author:ysrjdf
 */

@RestController
@RequestMapping("/ testlogging")
public class LoggingTestController {
    private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @GetMapping("/hello")
    public String hello(){
        logger.info("test logging ...");
        return "回来,你好";
    }
}
