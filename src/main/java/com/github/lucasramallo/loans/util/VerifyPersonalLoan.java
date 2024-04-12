package com.github.lucasramallo.loans.util;

import com.github.lucasramallo.loans.dtos.CustomerRequestDTO;

import java.math.BigDecimal;

public class VerifyPersonalLoan {
    public static boolean verify(CustomerRequestDTO customerRequestDTO) {
        return (
                customersSalaryEqualToOrLessThan3000(customerRequestDTO) ||
                (customersSalaryIsBetween3000And5000(customerRequestDTO) && customerUnder30YearsOld(customerRequestDTO) && custumerLiveInSP(customerRequestDTO))
        );
    }

    private static boolean customersSalaryEqualToOrLessThan3000(CustomerRequestDTO customerRequestDTO) {
        return customerRequestDTO.income().compareTo(BigDecimal.valueOf(3000)) <= 0;
    }

    private static boolean customersSalaryIsBetween3000And5000(CustomerRequestDTO customerRequestDTO) {
        return (customerRequestDTO.income().compareTo(BigDecimal.valueOf(3000)) > 0) &&
                (customerRequestDTO.income().compareTo(BigDecimal.valueOf(5000)) <= 0);
    }

    private static boolean customerUnder30YearsOld(CustomerRequestDTO customerRequestDTO) {
        return customerRequestDTO.age() < 30;
    }

    private static boolean custumerLiveInSP(CustomerRequestDTO customerRequestDTO) {
        return  customerRequestDTO.location().equals("SP");
    }
}
