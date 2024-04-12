package com.github.lucasramallo.loans.controllers;

import com.github.lucasramallo.loans.dtos.CustomerLeanResponseDTO;
import com.github.lucasramallo.loans.dtos.CustomerRequestDTO;
import com.github.lucasramallo.loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoanController {
    @Autowired
    private LoanService service;

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerLeanResponseDTO> verifyLoan(@RequestBody CustomerRequestDTO customerRequestDTO) {
        CustomerLeanResponseDTO customerLeanResponseDTO = this.service.consultLoanModalities(customerRequestDTO);
        return ResponseEntity.ok(customerLeanResponseDTO);
    }
}
