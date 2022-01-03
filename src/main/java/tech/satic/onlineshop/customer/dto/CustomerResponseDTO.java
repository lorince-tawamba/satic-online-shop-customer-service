// Package
package tech.satic.onlineshop.customer.dto;

// Librairie

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 27/11/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponseDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String email;
}
