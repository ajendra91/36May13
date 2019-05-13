package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
public class Codelabs1Application {

	public static void main(String[] args) {
		SpringApplication.run(Codelabs1Application.class, args);
	}

}
