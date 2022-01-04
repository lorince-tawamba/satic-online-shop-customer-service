// Package
package tech.satic.onlineshop.customer.web;

// Librairie

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
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
@Slf4j
public class CustomerRestAPI {

    private CustomerService customerService;

    public CustomerRestAPI(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/info")
    public String info() {
        log.info("Affiche les informations du microservice");
        return "SATIC ONLINE SHOP CUSTOMER SERVICE";
    }

    @PostMapping(path = "/add")
    public CustomerResponseDTO addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        log.info("Ajoute un nouveau client dans la base de données");
        return customerService.addCustomer(customerRequestDTO);
    }
}
