package com.github.lucasramallo.loans.domain.customer;

import com.github.lucasramallo.loans.domain.loan.Loan;
import com.github.lucasramallo.loans.domain.loan.LoanType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer age;
    private String cpf;
    private String name;
    private BigDecimal income;
    private String location;

    public boolean isCustomersSalaryEqualToOrLessThan3000() {
        return this.getIncome().compareTo(BigDecimal.valueOf(3000)) <= 0;
    }

    public boolean isCustomersSalaryIsBetween3000And5000() {
        return (this.getIncome().compareTo(BigDecimal.valueOf(3000)) > 0) &&
                (this.getIncome().compareTo(BigDecimal.valueOf(5000)) <= 0);
    }

    public boolean isCustomerUnder30YearsOld() {
        return this.getAge() < 30;
    }

    public boolean isCustomerLiveInSP() {
        return  this.getLocation().equals("SP");
    }

    public boolean isCustumerIncomeBiggestgGeaterThan5000() {
        return this.getIncome().compareTo(BigDecimal.valueOf(5000)) >= 0;
    }
}