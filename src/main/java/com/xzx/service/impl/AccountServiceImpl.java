package com.xzx.service.impl;

import com.xzx.dao.IAccountDao;
import com.xzx.entity.Account;
import com.xzx.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    @Qualifier(value = "accountDao")
    private IAccountDao iad;

    @Override
    public List<Account> findAll() {
        System.out.println("查询全部！！Service启动！");
        return iad.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存！！Service启动！");
        iad.saveAccount(account);
    }
}
