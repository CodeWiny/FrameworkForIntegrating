package com.qhq.dao;

import com.qhq.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 秦慧启
 * @Date: 2020/7/14 23:30
 * @Version: 1.0
 * 持久层接口
 */
@Repository
public interface AccountDao {
    //查找所有用户账号信息
    @Select("select * from account")
   public List<Account> findAllAccount();
   //保存账号
    @Insert("insert into account(name,money) values(#{name},#{money})")
   public void saveAccount(Account account);
}
