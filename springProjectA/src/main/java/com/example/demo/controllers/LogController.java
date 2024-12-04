package com.example.demo.controllers;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class LogController {
	@Autowired
	@Qualifier("primerComponente") 
	private static final Log L06 = LogFactory.getLog(LogController.class); 
	
	@GetMapping("/Metodo1")
	public String Metodo1() {
		L06.info("Ingreso al View1");
		return "view1";
	}
	
	@GetMapping("/Metodo2")
	public String Metodo2() {
		L06.info("Ingreso al View2");
		return "view2";
	}
}
