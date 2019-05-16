package com.itxiaoer.demo.spring.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : liuyk
 */
@SpringBootApplication
public class SpringApplicationDemo {

    public static void main(String[] args) {
        // 方式一
//        SpringApplication.run(SpringApplicationDemo.class, args);

        // 方式二
        //new SpringApplicationBuilder(SpringApplicationDemo.class).run(args);

        // server.port = 0 随机端口¬
//        new SpringApplicationBuilder(SpringApplicationDemo.class).properties("server.port=0").run(args);


    }
}
