package com.lxyw.authority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class LxywAuthorityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxywAuthorityApplication.class, args);
    }

}

