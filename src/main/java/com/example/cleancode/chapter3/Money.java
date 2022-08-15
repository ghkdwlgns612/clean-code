package com.example.cleancode.chapter3;

import java.util.InvalidPropertiesFormatException;

public class Money {
    private int amount;

    private Money() {
    }

    private Money(int amount) {
        this.amount = amount;
    }

    public static Money newInstance() {
        return new Money(0);
    }

    public Money calculatePay(Employee e) throws InvalidPropertiesFormatException {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidPropertiesFormatException(String.valueOf(e.type));
        }
    }

    private Money calculateSalariedPay(Employee e) {
        return Money.newInstance();
    }

    private Money calculateHourlyPay(Employee e) {
        return Money.newInstance();
    }

    private Money calculateCommissionedPay(Employee e) {
        return Money.newInstance();
    }
}
