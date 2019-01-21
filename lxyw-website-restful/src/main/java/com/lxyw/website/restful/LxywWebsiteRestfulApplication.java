package com.lxyw.website.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:consumer.xml"})
public class LxywWebsiteRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxywWebsiteRestfulApplication.class, args);
    }

}

