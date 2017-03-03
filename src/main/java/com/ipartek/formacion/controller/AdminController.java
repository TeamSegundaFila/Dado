package com.ipartek.formacion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.service.ServiceUsuario;

@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	ServiceUsuario serviceUsuario;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String listar(Model model) {
		logger.info("Entrando en admin");
		model.addAttribute("usuarios", serviceUsuario.listar());
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/usuario/edit", method = RequestMethod.GET)
	public String crear(Model model) {
		logger.info("Entrando en admin");
		
		model.addAttribute("usuario", new Usuario());
		return "admin/form";
	}
	
	@RequestMapping(value = "/admin/usuario/edit/{id}", method = RequestMethod.GET)
	public String editar(Model model, @PathVariable int id) {
		logger.info("Entrando en admin");
		
		model.addAttribute("usuario", serviceUsuario.buscarPorId(id));
		return "admin/form";
	}
	
}
