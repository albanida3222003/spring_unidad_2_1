package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.Iservicecliente;
import com.example.demo.entity.cliente;

@Controller
@RequestMapping("/sistema")
public class controller {
	
	@Autowired
	@Qualifier("servicecliente")
	private Iservicecliente servicecliente;
	
	//cliente
	@GetMapping("/lista")
	public String listarcliente(Model model) {
		model.addAttribute("clientes",servicecliente.listarclientes());
		return "listar";
	}
	
	@GetMapping("/insertar")
	public String getinsertarcliente(Model model) {
		model.addAttribute("cliente",new cliente());
		return "nuevo";
	}
	
	@PostMapping("/insertar")
	public String postinsertarcliente(@ModelAttribute cliente cliente) {
		servicecliente.Agregar(cliente);
		return "redirect:/sistema/lista";
	}
	
	@GetMapping("/editar")
	public String editarCliente(@RequestParam("id") int id, Model model) {
	    cliente c = servicecliente.buscarPorId(id);
	    model.addAttribute("cliente", c);
	    return "editar"; // Crear un archivo Thymeleaf "editar.html"
	}

	@PostMapping("/editar")
	public String actualizarCliente(@ModelAttribute cliente cliente) {
	    servicecliente.Agregar(cliente);
	    return "redirect:/sistema/lista";
	}

	@GetMapping("/eliminar")
	public String eliminarCliente(@RequestParam("id") int id) {
	    servicecliente.Eliminar(id);
	    return "redirect:/sistema/lista";
	}

	@GetMapping("/buscar")
	public String buscarCliente(@RequestParam("nombre") String nombre, Model model) {
	    List<cliente> clientes = servicecliente.buscarPorNombre(nombre);
	    model.addAttribute("clientes", clientes);
	    return "listar"; // Muestra los resultados en la misma vista de lista
	}

	
}
