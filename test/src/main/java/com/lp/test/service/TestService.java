package com.lp.test.service;

import org.springframework.stereotype.Component;

/**
 * @author liupeng
 * @version 1.0
 * @description: TODO
 * @date 2024/5/7 17:06
 */
@Component
public class TestService {

    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
