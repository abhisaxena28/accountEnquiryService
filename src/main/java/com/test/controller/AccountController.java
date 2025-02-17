package com.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Account;
import com.test.service.AccountService;
import com.test.service.TransactionService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;
    
    public AccountController(AccountService accountService, TransactionService transactionService) {
        this.accountService = accountService;
    }
    
    @GetMapping
    public List<Account> getAllAccounts() {
    	List<Account> acc= accountService.getAllAccounts();
    	System.out.print(acc.toString());
    	 System.out.println("Fetched " + acc.size() + " accounts");
    	return acc;
    }
}