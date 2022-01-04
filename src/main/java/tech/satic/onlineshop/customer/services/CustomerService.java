// Package
package tech.satic.onlineshop.customer.services;

import tech.satic.onlineshop.customer.dto.CustomerRequestDTO;
import tech.satic.onlineshop.customer.dto.CustomerResponseDTO;

public interface CustomerService {

    public CustomerResponseDTO addCustomer(CustomerRequestDTO customerRequestDTO);

}
