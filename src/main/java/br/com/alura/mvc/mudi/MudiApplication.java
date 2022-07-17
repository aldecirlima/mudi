package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// Esterder a classe SpringBootServletInitializer para que o empacotamento WAR funcione em produção.
@SpringBootApplication
public class MudiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MudiApplication.class, args);
	}

}
