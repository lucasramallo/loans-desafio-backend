package com.github.lucasramallo.loans.service;

import com.github.lucasramallo.loans.domain.customer.Customer;
import com.github.lucasramallo.loans.domain.loan.Loan;
import com.github.lucasramallo.loans.domain.loan.LoanType;
import com.github.lucasramallo.loans.dtos.CustomerLoanResponseDTO;
import com.github.lucasramallo.loans.dtos.CustomerRequestDTO;
import com.github.lucasramallo.loans.util.CustumerDtoToCustumer;
import com.github.lucasramallo.loans.util.VerifyPersonalAndGuaranteedLoan;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    public CustomerLoanResponseDTO consultLoanModalities(CustomerRequestDTO customerRequestDTO) {
        List<Loan> loanList = new ArrayList<>();

        Customer customer = CustumerDtoToCustumer.toCustomer(customerRequestDTO);

        if(VerifyPersonalAndGuaranteedLoan.verify(customer)){
            Loan personalLoan = new Loan(LoanType.PERSONAL, 4);
            Loan guaranteedLoan = new Loan(LoanType.GUARANTEED, 3);

            loanList.add(personalLoan);
            loanList.add(guaranteedLoan);
        }

        if(customerRequestDTO.income().compareTo(BigDecimal.valueOf(5000)) >= 0) {
            Loan consignmentLoan = new Loan(LoanType.CONSIGNMENT, 2);
            loanList.add(consignmentLoan);
        }

        return new CustomerLoanResponseDTO(customerRequestDTO.name(), loanList);
    }
}