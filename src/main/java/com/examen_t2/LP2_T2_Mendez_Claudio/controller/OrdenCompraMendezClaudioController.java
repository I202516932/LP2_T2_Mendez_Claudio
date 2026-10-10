package com.examen_t2.LP2_T2_Mendez_Claudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.examen_t2.LP2_T2_Mendez_Claudio.model.OrdenCompraMendezClaudio;
import com.examen_t2.LP2_T2_Mendez_Claudio.service.OrdenCompraMendezClaudioService;
import com.examen_t2.LP2_T2_Mendez_Claudio.service.ProveedorMendezClaudioService;

@Controller
@RequestMapping("/orden")
public class OrdenCompraMendezClaudioController {

	@Autowired
	private OrdenCompraMendezClaudioService ordenService;

	@Autowired
	private ProveedorMendezClaudioService proveedorService;

	@GetMapping("/listado")
	public String listado(Model model) {
		model.addAttribute("ordenes", ordenService.listar());
		return "listadoMendezClaudio";
	}

	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		model.addAttribute("orden", new OrdenCompraMendezClaudio());
		model.addAttribute("proveedores", proveedorService.listar());
		return "nuevoMendezClaudio";
	}

	@PostMapping("/registrar")
	public String registrar(@ModelAttribute("orden") OrdenCompraMendezClaudio orden, RedirectAttributes ra) {
		OrdenCompraMendezClaudio nueva = ordenService.guardar(orden);
		ra.addFlashAttribute("mensaje", "Orden de compra Nro. " + nueva.getNroOrden() + " registrada.");
		return "redirect:/orden/listado";
	}

	@GetMapping("/editar/{nro}")
	public String editar(@PathVariable Integer nro, Model model) {
		model.addAttribute("orden", ordenService.buscar(nro));
		model.addAttribute("proveedores", proveedorService.listar());
		return "edicionMendezClaudio";
	}

	@PostMapping("/actualizar")
	public String actualizar(@ModelAttribute("orden") OrdenCompraMendezClaudio orden, RedirectAttributes ra) {
		OrdenCompraMendezClaudio act = ordenService.guardar(orden);
		ra.addFlashAttribute("mensaje", "Orden de compra Nro. " + act.getNroOrden() + " actualizada.");
		return "redirect:/orden/listado";
	}
}