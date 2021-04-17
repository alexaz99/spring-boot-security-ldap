package alex.security.ldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Will create a local LDAP server to run the project.
 * Need to add some jars dependencies. see pom.xml
 */
@SpringBootApplication
public class SpringBootSecurityLdapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityLdapApplication.class, args);
	}

}
