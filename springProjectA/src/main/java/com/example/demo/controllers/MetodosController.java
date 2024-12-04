package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;
import com.example.demo.model.*;

@Controller
@RequestMapping("/MetodosController")
public class MetodosController {
	@GetMapping(value = "/Metodo1")
	public String Metodo1() {
		return "Vista1";
	}

	@GetMapping(value = "/Metodo2")
	public ModelAndView Metodo2() {
		return new ModelAndView("Vista2");
	}
	
	@GetMapping(value = "/Metodo3")
	public ModelAndView Metodo3() {
		ModelAndView mav = new ModelAndView("Vista3");
		mav.addObject("p",getPersonas());
		return mav;
	}
	
	@GetMapping(value = "/Metodo4")
	public ModelAndView Metodo4(@RequestParam(name="nombre") String nombre) {
		ModelAndView mav = new ModelAndView("Vista4");
		mav.addObject("nombre",nombre);
		return mav;
	}
	
	@GetMapping(value = "/Metodo5/{nombre}")
	public ModelAndView Metodo5(@PathVariable(name="nombre") String nombre) {
		ModelAndView mav = new ModelAndView("Vista5");
		mav.addObject("nombre",nombre);
		return mav;
	}

	private List<Persona> getPersonas() {
		List<Persona> p = new ArrayList<>();
		p.add(new Persona("Juan", "910466464"));
		p.add(new Persona("Pedro", "910466465"));
		p.add(new Persona("Raul", "910466466"));
		p.add(new Persona("Miguel", "910466467"));
		p.add(new Persona("Arturo", "910466468"));
		return p;
	}

}
