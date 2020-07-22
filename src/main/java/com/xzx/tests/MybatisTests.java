package com.xzx.tests;

import com.xzx.entity.Account;
import com.xzx.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//把spring的配置文件交给junit
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MybatisTests {
    @Autowired
    @Qualifier(value = "accountService")
    private IAccountService ias;

    @Test
    public void run1()
    {
        ias.findAll();
    }

    @Test
    public void run2()
    {
        Account ac=new Account();
        ac.setName("new one");
        ac.setMoney(255d);
        ias.saveAccount(ac);
    }
}
