package com.example.cleancode.chapter11.proxy;

//패키지 이름 감추기
import java.util.*;

public interface Bank {
    Collection<Account> getAccounts();
    void setAccounts(Collection<Account> accounts);
}
