package com.xzx.tests;

import com.xzx.service.IAccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void run()
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService ias= (IAccountService) ac.getBean("accountService");
        ias.findAll();
    }

    @Autowired
    private IAccountService ias;

    @Test
    public void run1()
    {
        ias.findAll();
    }
}
