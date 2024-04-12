package com.github.lucasramallo.loans.dtos;

import java.math.BigDecimal;

public record CustomerRequestDTO(
        Integer age,
        String cpf,
        String name,
        BigDecimal income,
        String location
        ) {}
