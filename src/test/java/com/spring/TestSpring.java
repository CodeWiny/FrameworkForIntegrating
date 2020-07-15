package com.spring;

import com.qhq.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 秦慧启
 * @Date: 2020/7/15 10:48
 * @Version: 1.0
 */
public class TestSpring {

    @Test
    public void testSring(){
        ApplicationContext as = new ClassPathXmlApplicationContext("classpath:appicatinContext.xml");
        AccountService accountService = as.getBean("accountService", AccountService.class);
        accountService.findAllAccount();
    }
}
