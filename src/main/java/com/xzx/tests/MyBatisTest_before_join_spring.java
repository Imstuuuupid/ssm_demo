package com.xzx.tests;


import com.xzx.dao.IAccountDao;
import com.xzx.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest_before_join_spring {

    @Test
    public void run1 () throws IOException {
        Account ac=new Account();
        ac.setName("xzxabc");
        ac.setMoney(123d);
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("mapperConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IAccountDao dao = session.getMapper(IAccountDao.class);
        // 保存
        dao.saveAccount(ac);
        // 提交事务
        session.commit();
        // 关闭资源
        session.close();
        in.close();
    }

    @Test
    public void run2() throws Exception {
        InputStream in = Resources.getResourceAsStream("mapperConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        IAccountDao dao = session.getMapper(IAccountDao.class);

        List<Account> list = dao.findAll();
        for (Account account: list ) {
            System.out.println(account);
        }

        session.close();
        in.close();
    }
}
