package com.demo.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;



@EnableScheduling
@SpringBootApplication
public class ArticleApplication {

    //启动类
    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
    }

}
