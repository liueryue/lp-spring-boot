package com.lp.springboot;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.Map;

import static com.lp.springboot.TomcatWebServer.startTomcat;

/**
 * @author liupeng
 * @version 1.0
 * @description: TODO
 * @date 2024/5/7 17:11
 */
public class LPSpringApplication {
    public static void run(Class clazz) {
        System.out.println("Hello World!");
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(clazz);
        webApplicationContext.refresh();

//        TomcatWebServer.startTomcat(webApplicationContext);
        getWebServer(webApplicationContext).start();
    }

    public static WebServer getWebServer(WebApplicationContext applicationContext){
        Map<String, WebServer> beansOfType = applicationContext.getBeansOfType(WebServer.class);

        if (beansOfType.isEmpty()) {
            throw new NullPointerException();
        }

        if (beansOfType.size() > 1) {
            throw new IllegalStateException();
        }
        return beansOfType.values().stream().findFirst().get();
    }

}
