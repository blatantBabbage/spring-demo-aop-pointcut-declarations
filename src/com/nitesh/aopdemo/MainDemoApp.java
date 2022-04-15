package com.nitesh.aopdemo;

import com.nitesh.aopdemo.dao.AccountDAO;
import com.nitesh.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the AccountDAO bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // get the MembershipDAO bean from spring container
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        // call the AccountDAO business method
        theAccountDAO.addAccount();

        // call the MembershipDAO business method
        theMembershipDAO.addAccount();

        Account account = new Account();

        theAccountDAO.addAccount(account);

        // close the context
        context.close();

    }
}
