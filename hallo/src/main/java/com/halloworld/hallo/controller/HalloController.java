package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HalloController {
	
	@GetMapping
	public String hello() {
		return "Hello World!!\n" + 
		"\nBSM’s da Generation Brasil:" + 
				"\nMentalidades:"+ "\nOrientação ao Futuro"
				+ "\nResponsabilidade Pessoal"
				+ "\nMentalidade de Crescimento"
				+ "\nPersistência"
				+ "\nHabilidades:"
				+ "\nTrabalho em Equipe"
				+ "\nAtenção aos Detalhes"
				+ "\nProatividade"
				+ "\nComunicação\n"
				+ "\nObjetivos de aprendizagem desta semana:"
				+ "\nImplementar e utilizar o Spring Boot"
				
	;
		
	}
	
	

}
