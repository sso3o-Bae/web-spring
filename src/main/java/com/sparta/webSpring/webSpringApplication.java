package com.sparta.webSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class webSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(webSpringApplication.class, args);
    }

}