package com.qhq.service;

import com.qhq.domain.Account;

import java.util.List;

/**
 * @Author: 秦慧启
 * @Date: 2020/7/14 23:32
 * @Version: 1.0
 * 业务层接口
 */
public interface AccountService {
    //查找所有用户账号信息
    public List<Account> findAllAccount();
    //保存账号
    public void saveAccount(Account account);
}
