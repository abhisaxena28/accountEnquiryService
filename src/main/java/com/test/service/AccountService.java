package com.test.service;

import com.test.model.Account;
import com.test.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}