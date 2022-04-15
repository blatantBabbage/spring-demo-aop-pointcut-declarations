package com.nitesh.aopdemo.dao;

import com.nitesh.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(getClass() + ": Doing my DB work - adding an account");
    }

    public void addAccount(Account account) {
        System.out.println(getClass() + ": adding an Account");
    }
}
