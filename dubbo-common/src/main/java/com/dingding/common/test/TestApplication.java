package com.dingding.common.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-21
 */
@SpringBootApplication(scanBasePackages = "com.dingding")
public class TestApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(TestApplication.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }

    }
}
