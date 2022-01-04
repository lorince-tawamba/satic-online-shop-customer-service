// Package
package tech.satic.onlineshop.customer.services;

// Librairie
import org.springframework.stereotype.Service;
import tech.satic.onlineshop.customer.repositories.CustomerRepository;

import javax.transaction.Transactional;

/**
 * Implémentation des services.
 * @version     1.0.0
 * @since       04/01/2022
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
