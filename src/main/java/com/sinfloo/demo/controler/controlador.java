package com.sinfloo.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinfloo.demo.interfaceService.IpersonaService;
import com.sinfloo.demo.model.persona;

@Controller
@RequestMapping
public class controlador {

	@Autowired
	private IpersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<persona>persona=service.listar();
		model.addAttribute("persona", persona);
		return "index";
	}
}
