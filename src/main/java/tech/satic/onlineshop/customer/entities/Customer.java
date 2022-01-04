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
@Entity(name = "Customer")
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
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    @Column(
            name = "customer_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String nom;

    @Column(
            name = "last_name",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String prenom;

    @Column(
            name = "mobile_phone_number",
            nullable = true,
            length = 15
    )
    private String tel;

    @Column(
            name = "address",
            nullable = false,
            length = 60
    )
    private String adresse;

    @Column(
            name = "email",
            nullable = false,
            length = 60
    )
    private String email;
}
