package com.lp.test.controller;

import com.lp.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liupeng
 * @version 1.0
 * @description: TODO
 * @date 2024/5/7 17:05
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(@RequestParam("name") String name){
        return testService.sayHello(name);
    }
}
