package com.lxyw.authority;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.lxyw.authority.mapper")
@SpringBootTest
public class LxywAuthorityApplicationTests {

    //日志输出LOGBACK
    protected static Logger logger = LoggerFactory.getLogger(LxywAuthorityApplicationTests.class);

    @Before
    public void init() {
        logger.info("开始测试-----------------");
    }

    @After
    public void after() {
        logger.info("测试结束-----------------");
    }


}

