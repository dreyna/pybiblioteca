package com.example.sysbiblioteca.controller.general;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String home() {
		return "Bienvenido al Sistema de Biblioteca";
	}

}
