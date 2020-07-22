package com.xzx.controller;

import com.xzx.entity.Account;
import com.xzx.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private IAccountService ias;


    @RequestMapping("account/findAll.json")
    public List<Account> findAll()
    {
        List<Account> res=ias.findAll();
        System.out.println("findAll() controller执行了！");
        return res;
    }

    @RequestMapping("account/saveAccount")
    public void saveAccount(Account account)
    {
        System.out.println("saveAccount() controller执行了");
        ias.saveAccount(account);
    }
}
