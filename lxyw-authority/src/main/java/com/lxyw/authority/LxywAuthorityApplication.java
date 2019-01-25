package com.lxyw.authority;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.lxyw.authority.mapper")
@ImportResource("classpath:provider.xml")
public class LxywAuthorityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxywAuthorityApplication.class, args);
    }

}

