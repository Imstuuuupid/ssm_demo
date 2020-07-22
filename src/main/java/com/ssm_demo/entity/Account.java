package com.ssm_demo.entity;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2020-07-21 15:14:47
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 227511935151864679L;

    private Integer id;

    private String name;

    private Object money;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getMoney() {
        return money;
    }

    public void setMoney(Object money) {
        this.money = money;
    }

}