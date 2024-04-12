package com.github.lucasramallo.loans.controllers;

import com.github.lucasramallo.loans.dtos.CustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoanController {

    @PostMapping("/customer-loans")
    public void verifyLoan(@RequestBody CustomerDTO customerDTO) {

    }
}
