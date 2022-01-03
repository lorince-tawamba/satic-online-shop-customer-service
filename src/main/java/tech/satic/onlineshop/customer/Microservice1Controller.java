// Package
package tech.satic.onlineshop.customer;

// Librairie
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe control.
 * @version     1.0.0
 * @since       02/01/2022
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@RestController
@RequestMapping(path = "/api/v1")
public class Microservice1Controller {

    @GetMapping(path = "/info")
    public String info() {
        return "SATIC ONLINE SHOP CUSTOMER SERVICE";
    }

}
