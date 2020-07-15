package com.mybatis;

import com.qhq.dao.AccountDao;
import com.qhq.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: 秦慧启
 * @Date: 2020/7/15 13:39
 * @Version: 1.0
 */
public class TestMybatis {
    //提取变量
    InputStream in = null;
    SqlSession session = null;
    AccountDao dao = null;

    @Before
    public void init() throws IOException {
        //获取输入字节流
        in = Resources.getResourceAsStream("SqlMapperConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        session = factory.openSession();
        //创建代理对象
        dao = session.getMapper(AccountDao.class);
    }

    @After
    public void destroy() throws IOException {
        //关闭资源
        session.commit();
        session.close();
        in.close();
    }

    /**
     * 查询所有账户信息
     *
     * @throws Exception
     */
    @Test
    public void TestMyibatis() throws Exception {
        List<Account> accounts = dao.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    @Test
    public void testSave(){
        Account account = new Account();
        account.setId(3);
        account.setName("万五");
        account.setMoney(120d);
        dao.saveAccount(account);
    }

}
