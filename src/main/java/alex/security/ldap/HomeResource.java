package alex.security.ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple rest controller
 */
@RestController
public class HomeResource {

    @GetMapping("/")
    public String index() {
        return "Home page";
    }
}
