package com.github.lucasramallo.loans.util;

import com.github.lucasramallo.loans.domain.customer.Customer;
import com.github.lucasramallo.loans.dtos.CustomerRequestDTO;

public class CustumerDtoToCustumer {
    public static Customer toCustomer(CustomerRequestDTO customerRequestDTO) {
        return new Customer(
                customerRequestDTO.age(),
                customerRequestDTO.cpf(),
                customerRequestDTO.name(),
                customerRequestDTO.income(),
                customerRequestDTO.location()
        );
    }
}
