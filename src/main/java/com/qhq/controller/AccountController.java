package com.qhq.controller;

import com.qhq.domain.Account;
import com.qhq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 秦慧启
 * @Date: 2020/7/15 11:18
 * @Version: 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String testFindAll(Model model){
        System.out.println("表现层测试开始");
        List<Account> accounts = accountService.findAllAccount();
        model.addAttribute("account", accounts);
        return "spring";
    }
    @RequestMapping("/save")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("保存方法执行了");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");

    }
}
