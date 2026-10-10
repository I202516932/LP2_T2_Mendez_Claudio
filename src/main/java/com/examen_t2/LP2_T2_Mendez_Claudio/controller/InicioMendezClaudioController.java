package com.examen_t2.LP2_T2_Mendez_Claudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioMendezClaudioController {

	@GetMapping("/")
	public String inicio() {
		return "redirect:/orden/listado";
	}
}