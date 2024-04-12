package com.github.lucasramallo.loans.dtos;

import com.github.lucasramallo.loans.domain.loan.Loan;

import java.util.List;

public record CustomerLeanResponseDTO(String customer, List<Loan> loans) {}
