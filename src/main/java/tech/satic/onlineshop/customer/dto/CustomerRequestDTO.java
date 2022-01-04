// Package
package tech.satic.onlineshop.customer.dto;

// Librairie
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private String name;
    private String prenom;
    private String tel;
    private String adresse;
    private String email;
}
