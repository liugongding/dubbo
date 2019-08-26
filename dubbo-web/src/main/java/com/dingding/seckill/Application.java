package com.dingding.seckill;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-08-22
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.dingding")
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

//        for (String name : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
    }
}
