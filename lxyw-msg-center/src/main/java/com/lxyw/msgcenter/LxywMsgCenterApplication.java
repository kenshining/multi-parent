package com.lxyw.msgcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class LxywMsgCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxywMsgCenterApplication.class, args);
    }

}

