// Package
package tech.satic.onlineshop.customer.mappers;

// Librairie
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import tech.satic.onlineshop.customer.dto.CustomerRequestDTO;
import tech.satic.onlineshop.customer.dto.CustomerResponseDTO;
import tech.satic.onlineshop.customer.entities.Customer;

/**
 * Interface de mappind Entité - DTO.
 * @version     1.0.0
 * @since       03/01/2022
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    //@Mapping(source = "nom", target = "first_name")
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);

    Customer customerRequestDTOCustomer(CustomerRequestDTO customerRequestDTO);
}
