package com.nitesh.aopdemo.dao;

import com.nitesh.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public String getName() {
        System.out.println(getClass() + ": Doing getter name stuff");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": Doing name setter stuff");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": Doing getter service stuff");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": Doing service setter stuff");
        this.serviceCode = serviceCode;
    }

    public void addAccount() {
        System.out.println(getClass() + ": Doing my DB work - adding an account");
    }

    public void addAccount(Account account) {
        System.out.println(getClass() + ": adding an Account");
    }
}
