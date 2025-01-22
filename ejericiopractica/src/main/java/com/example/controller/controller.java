package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.cliente;
import com.example.entity.detalle;
import com.example.service.Iservicecliente;
import com.example.service.Iservicedetalle;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sistemaventa")
public class controller {
	
	@Autowired
	@Qualifier("servicecliente")
	private Iservicecliente servicecliente;
	
	@Autowired
	@Qualifier("servicedetalle")
	private Iservicedetalle servicedetalle;
	
	
	
	//clientes
	@GetMapping("/lista")
	public String listarcliente(Model model) {
		model.addAttribute("clientes",servicecliente.listarclientes());
		return "listclientes";
	}
	
	
	@GetMapping("/insertar")
	public String getinsertarcliente(Model model) {
		model.addAttribute("cliente",new cliente());
		return "insertarcliente";
	}
	
	@PostMapping("/insertar")
	public String postinsertarcliente(@ModelAttribute cliente cliente) {
		servicecliente.Agregar(cliente);
		return "redirect:/sistemaventa/lista";
	}
	
	
	//Producto
	
	//Compra
	@GetMapping("/vercompras/{id}")
	public String getMethodName(@PathVariable int id,Model model) {
		List<String[]> productos = new ArrayList<String[]>();		
		for (detalle d  : servicedetalle.listarpordutosseguncliente(id)) {
			String prod[]=new String [3];
			prod[0]=d.getProducto().getIdproducto()+"";
			prod[1]=d.getProducto().getNombre();
			prod[2]=d.getProducto().getPrecio()+"";
			productos.add(prod);
		}		
		model.addAttribute("productos",productos);
		return "listcompra";
	}
	
	
	
}
