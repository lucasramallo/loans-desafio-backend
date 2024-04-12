package com.github.lucasramallo.loans.domain.loan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Loan {
    private LoanType type;
    private String interest_rate;
}
