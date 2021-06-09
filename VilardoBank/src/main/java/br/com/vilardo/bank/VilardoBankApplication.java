package br.com.vilardo.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VilardoBankApplication {

	public static void main(String[] args) {
		
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(VilardoBankApplication.class, args);
	}

}
