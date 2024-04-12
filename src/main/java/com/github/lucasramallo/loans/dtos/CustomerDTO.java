package com.github.lucasramallo.loans.dtos;

import java.math.BigDecimal;

public record CustomerDTO(
        Integer age,
        String cpf,
        String name,
        BigDecimal income,
        String location
        ) {}
