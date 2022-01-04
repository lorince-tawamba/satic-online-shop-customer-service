// Package
package tech.satic.onlineshop.customer.repositories;

// Librairie
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.satic.onlineshop.customer.entities.Customer;

/**
 * Interface de communication avec la base de données.
 * @version     1.0.0
 * @since       04/01/2022
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
