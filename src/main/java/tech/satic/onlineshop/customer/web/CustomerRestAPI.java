// Package
package tech.satic.onlineshop.customer.web;

// Librairie

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.satic.onlineshop.customer.dto.CustomerRequestDTO;
import tech.satic.onlineshop.customer.dto.CustomerResponseDTO;
import tech.satic.onlineshop.customer.services.CustomerService;

/**
 * Couche web d'accès aux API.
 * @version     1.0.0
 * @since       04/01/2022
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@RestController
@RequestMapping(path = "/customer/api")
public class CustomerRestAPI {

    private CustomerService customerService;

    public CustomerRestAPI(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/info")
    public String info() {
        return "SATIC ONLINE SHOP CUSTOMER SERVICE";
    }

    @GetMapping(path = "/add")
    public CustomerResponseDTO addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        return customerService.addCustomer(customerRequestDTO);
    }
}
