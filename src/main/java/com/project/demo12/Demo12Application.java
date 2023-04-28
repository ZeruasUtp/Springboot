package com.project.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/saludar")
public class Demo12Application {		

	public static void main(String[] args) {
		SpringApplication.run(Demo12Application.class, args);
	}


	
	@GetMapping 
	String holamundo(@RequestParam(defaultValue = "mundo") String nombre, Model model  ){
		model.addAttribute("nombre", nombre);
		return "hola";
		
	}

	@GetMapping("/hola")
	public String hola(
			@RequestParam(value = "nombre", defaultValue = "mundo") String nombre) {
		return String.format("Hola %s", nombre);
	}


}
 