package com.github.lucasramallo.loans.service;

import com.github.lucasramallo.loans.domain.customer.Customer;
import com.github.lucasramallo.loans.domain.loan.Loan;
import com.github.lucasramallo.loans.domain.loan.LoanType;
import com.github.lucasramallo.loans.dtos.CustomerLoanResponseDTO;
import com.github.lucasramallo.loans.dtos.CustomerRequestDTO;
import com.github.lucasramallo.loans.util.CustumerDtoToCustumer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    public CustomerLoanResponseDTO consultLoanModalities(CustomerRequestDTO customerRequestDTO) {
        List<Loan> loanList = new ArrayList<>();

        Customer customer = CustumerDtoToCustumer.toCustomer(customerRequestDTO);

        if (this.checkIfPersonalAndGuaranteedLoan(customer)) {
            Loan personalLoan = new Loan(LoanType.PERSONAL, 4);
            Loan guaranteedLoan = new Loan(LoanType.GUARANTEED, 3);

            loanList.add(personalLoan);
            loanList.add(guaranteedLoan);
        }

        if (customer.isCustumerIncomeBiggestgGeaterThan5000()) {
            Loan consignmentLoan = new Loan(LoanType.CONSIGNMENT, 2);
            loanList.add(consignmentLoan);
        }

        return new CustomerLoanResponseDTO(customerRequestDTO.name(), loanList);
    }

    private boolean checkIfPersonalAndGuaranteedLoan(Customer customer) {
        return (
                customer.isCustomersSalaryEqualToOrLessThan3000() ||
                (
                    customer.isCustomersSalaryIsBetween3000And5000() &&
                    customer.isCustomerUnder30YearsOld() &&
                    customer.isCustomerLiveInSP()
                )
        );
    }
}