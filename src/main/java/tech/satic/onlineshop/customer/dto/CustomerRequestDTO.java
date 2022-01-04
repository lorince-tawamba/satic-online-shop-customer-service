// Package
package tech.satic.onlineshop.customer.dto;

// Librairie
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe DTO.
 * @version     1.0.0
 * @since       03/01/2022
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String email;
}
