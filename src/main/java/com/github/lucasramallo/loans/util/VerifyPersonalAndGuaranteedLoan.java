package com.github.lucasramallo.loans.util;

import com.github.lucasramallo.loans.domain.customer.Customer;

import java.math.BigDecimal;

public class VerifyPersonalAndGuaranteedLoan {
    public static boolean verify(Customer customer) {
        return (
                customersSalaryEqualToOrLessThan3000(customer) ||
                (customersSalaryIsBetween3000And5000(customer) && customerUnder30YearsOld(customer) && customerLiveInSP(customer))
        );
    }

    private static boolean customersSalaryEqualToOrLessThan3000(Customer customer) {
        return customer.getIncome().compareTo(BigDecimal.valueOf(3000)) <= 0;
    }

    private static boolean customersSalaryIsBetween3000And5000(Customer customer) {
        return (customer.getIncome().compareTo(BigDecimal.valueOf(3000)) > 0) &&
                (customer.getIncome().compareTo(BigDecimal.valueOf(5000)) <= 0);
    }

    private static boolean customerUnder30YearsOld(Customer customer) {
        return customer.getAge() < 30;
    }

    private static boolean customerLiveInSP(Customer customer) {
        return  customer.getLocation().equals("SP");
    }
}
