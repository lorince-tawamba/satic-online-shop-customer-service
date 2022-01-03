// Package
package tech.satic.onlineshop.customer.entities;

// Librairies

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 03/01/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_customer",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email"
                ),
                @UniqueConstraint(
                        name = "mobile_phone_number_unique",
                        columnNames = "mobile_phone_number"
                )
        }
)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "first_name", length = 60, nullable = false)
    private String nom;

    @Column(name = "last_name", length = 60)
    private String prenom;

    @Column(name = "mobile_phone_number", length = 15)
    private String tel;

    @Column(name = "address", length = 30)
    private String adresse;

    @Column(name = "email", length = 30)
    private String email;
}
