package net.purocodigo.encuestabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EncuestabackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncuestabackendApplication.class, args);
		System.out.println("FUNCIONANDO");
	}

}
