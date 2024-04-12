package com.github.lucasramallo.loans.service;

import com.github.lucasramallo.loans.domain.customer.Customer;
import com.github.lucasramallo.loans.domain.loan.Loan;
import com.github.lucasramallo.loans.domain.loan.LoanType;
import com.github.lucasramallo.loans.dtos.CustomerDTO;
import com.github.lucasramallo.loans.util.VerifyPersonalLoan;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LoanService {
    public void consultLoanModalities(CustomerDTO customerDTO) {
        Loan personalLoan = new Loan(LoanType.PERSONAL, 4);
        Loan guaranteedLoan = new Loan(LoanType.GUARANTEED, 3);
        Loan consignmentLoan = new Loan(LoanType.CONSIGNMENT, 2);


        if(VerifyPersonalLoan.verify(customerDTO)){

        }

    }


}




/*
Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
* */