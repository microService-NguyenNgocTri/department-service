package com.example.khoaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class KhoaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhoaServiceApplication.class, args);
    }

}
