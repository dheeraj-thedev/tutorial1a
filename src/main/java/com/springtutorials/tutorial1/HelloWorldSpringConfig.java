package com.springtutorials.tutorial1;

import com.springtutorials.tutorial1.config.Tutorial1Config;
import com.springtutorials.tutorial1.services.DummyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author amit@springtutorials.com
 */
public class HelloWorldSpringConfig {

    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Tutorial1Config.class);
        System.out.println(" Spring Tutorial 1: Hello World with Config in its own file. ");
        //DummyService dummyService = new DummyServiceImpl();
        DummyService dummyService = ctx.getBean(DummyService.class);
        System.out.println(" DummyService returned: "+dummyService.test());
    }

}
