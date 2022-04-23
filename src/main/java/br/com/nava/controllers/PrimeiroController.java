package br.com.nava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//CLASSE CONTROLADORA
@RestController
public class PrimeiroController {
	
	//ENDPOINT
	@GetMapping("bem-vindo-spring")//IGUAL AO QUE ESTÁ NA URL PARA ASSOCIAR A ENDPOINT COM O VERBO 
	public String bemVindo() {
		return "Bem-Vindo";
	}
	
	@PostMapping("bem-vindo-spring")
	public String bemVindoPost() {
		return "Bem-vindo Post";
	}
}
