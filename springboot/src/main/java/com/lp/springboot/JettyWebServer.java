package com.lp.springboot;

/**
 * @author liupeng
 * @version 1.0
 * @description: TODO
 * @date 2024/5/7 17:26
 */
public class JettyWebServer implements WebServer {
    @Override
    public void start() {
        System.out.println("JettyWebServer is starting...");
    }

}
