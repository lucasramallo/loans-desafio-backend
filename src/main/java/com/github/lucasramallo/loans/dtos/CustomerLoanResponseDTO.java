package com.github.lucasramallo.loans.dtos;

import com.github.lucasramallo.loans.domain.loan.Loan;

import java.util.List;

public record CustomerLoanResponseDTO(String customer, List<Loan> loans) {}
