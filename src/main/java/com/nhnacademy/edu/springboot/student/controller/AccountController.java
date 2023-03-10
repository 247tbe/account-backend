package com.nhnacademy.edu.springboot.student.controller;

import com.nhnacademy.edu.springboot.student.model.Account;
import com.nhnacademy.edu.springboot.student.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/web/accounts/{id}")
    public String getAccount(@PathVariable Long id,
                             Model model) {
        Account account = accountService.getAccount(id);
        model.addAttribute("account", account);
        return "account";
    }
}
