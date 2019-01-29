package com.lxyw.authority;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages={"com.lxyw.authority.mapper.*"})
@ComponentScan("com.lxyw.authority.*")
@ImportResource("classpath:provider.xml")
public class LxywAuthorityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxywAuthorityApplication.class, args);
    }

}

