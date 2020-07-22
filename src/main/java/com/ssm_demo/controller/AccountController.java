package com.ssm_demo.controller;

import com.ssm_demo.entity.Account;
import com.ssm_demo.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2020-07-21 15:14:50
 */
@RestController
@RequestMapping("account/")
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne.json")
    public Account selectOne(Integer id) {
        return this.accountService.queryById(id);
    }


    @RequestMapping("findAll")
    public List<Account> queryAllByLimit(int offset,int limit)
    {
        List<Account> res=accountService.queryAllByLimit(0,3);

        return res;
    }

}