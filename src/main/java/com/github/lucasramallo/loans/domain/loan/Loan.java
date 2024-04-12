package com.github.lucasramallo.loans.domain.loan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
    private LoanType type;
    private Integer interest_rate;
}
