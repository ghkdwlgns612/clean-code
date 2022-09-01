package com.example.cleancode.chapter11.proxy;

import java.lang.reflect.*;

//프록시 API가 필요한 InvocationHandler
public class BankProxyHandler implements InvocationHandler {
    private Bank bank;

    public BankProxyHandler(Bank bank) {
        this.bank = bank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("getAccounts")) {
            //
        } else if (methodName.equals("setAccounts")) {
            //
        } else {
            //
        }
        return null;
    }
}
