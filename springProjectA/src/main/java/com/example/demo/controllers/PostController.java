package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/ejemplopost")
public class PostController {
	
	//Formal	
	@GetMapping("/for1")
	public String redirect1() {
		return"redirect:/ejemplopost/form";
	}
	
	//Forma2
	@GetMapping("/form2")
	public RedirectView redirect2() {
		return new RedirectView("/ejemplopost/form");
	}
	
	@GetMapping("/form")
	public String Form(Model model) {
		model.addAttribute("persona", new Persona());
		return "formulario";
	}
	
	@PostMapping("/addpersona")
	public ModelAndView Resultado(@ModelAttribute("persona") Persona persona) {
		ModelAndView mav = new ModelAndView("resultado");
		mav.addObject("persona", persona);
		return mav;
	}
}
