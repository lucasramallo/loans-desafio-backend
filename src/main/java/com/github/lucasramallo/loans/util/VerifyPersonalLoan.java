package com.github.lucasramallo.loans.util;

import com.github.lucasramallo.loans.dtos.CustomerDTO;

import java.math.BigDecimal;

public class VerifyPersonalLoan {
    public static boolean verify(CustomerDTO customerDTO) {
        return (
                customersSalaryEqualToOrLessThan3000(customerDTO) ||
                (customersSalaryIsBetween3000And5000(customerDTO) && customerUnder30YearsOld(customerDTO) && custumerLiveInSP(customerDTO))
        );
    }

    private static boolean customersSalaryEqualToOrLessThan3000(CustomerDTO customerDTO) {
        return customerDTO.income().compareTo(BigDecimal.valueOf(3000)) <= 0;
    }

    private static boolean customersSalaryIsBetween3000And5000(CustomerDTO customerDTO) {
        return (customerDTO.income().compareTo(BigDecimal.valueOf(3000)) > 0) &&
                (customerDTO.income().compareTo(BigDecimal.valueOf(5000)) <= 0);
    }

    private static boolean customerUnder30YearsOld(CustomerDTO customerDTO) {
        return customerDTO.age() < 30;
    }

    private static boolean custumerLiveInSP(CustomerDTO customerDTO) {
        return  customerDTO.location().equals("SP");
    }
}
