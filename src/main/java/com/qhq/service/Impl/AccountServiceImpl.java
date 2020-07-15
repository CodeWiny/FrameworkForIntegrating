package com.qhq.service.Impl;

import com.qhq.dao.AccountDao;
import com.qhq.domain.Account;
import com.qhq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 秦慧启
 * @Date: 2020/7/14 23:33
 * @Version: 1.0
 * 业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAllAccount() {
        System.out.println("业务层的查询所有方法执行了......");
        List<Account> accounts = accountDao.findAllAccount();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层的保存方法执行了......");
        accountDao.saveAccount(account);
    }
}
