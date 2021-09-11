package com.clientregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientRegistrationApplication {

	/*
	 * uns 2 cadastros  e vc precisa fazer uma autenticação 
	 * pra proteger algumas rotas  e deixar outras publicas 
	 * ai se vc fizer testes, subir com docker ganha pontos kkk
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(ClientRegistrationApplication.class, args);
	}

}
