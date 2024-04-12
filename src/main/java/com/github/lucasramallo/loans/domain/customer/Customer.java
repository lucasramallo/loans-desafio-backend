package com.github.lucasramallo.loans.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private Integer age;
    private String cpf;
    private String name;
    private BigDecimal income;
    private String location;
}