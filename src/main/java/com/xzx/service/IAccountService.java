package com.xzx.service;

import com.xzx.entity.Account;

import java.util.List;

public interface IAccountService {
    /**
     * 查询所有用户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存用户
     * @param account
     */
    public void saveAccount(Account account);
}
