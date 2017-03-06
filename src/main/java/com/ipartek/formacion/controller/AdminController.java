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
/**
 * Controlador para Administraion de usuarios
 * @author Curso
 *
 */
@Controller()
public class AdminController {
	
	private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired()
	private ServiceUsuario serviceUsuario;
	/**
	 * Listar todos los usuarios
	 * @param model atributos para la vista
	 * @return al index.jsp
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String listar(Model model) {
		LOG.info("Entrando en admin");
		model.addAttribute("usuarios", this.serviceUsuario.listar());
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/usuario/edit", method = RequestMethod.GET)
	public String formularioCrear(Model model) {
		LOG.info("Entrando en admin");
		
		model.addAttribute("usuario", new Usuario());
		return "admin/form";
	}
	
	@RequestMapping(value = "/admin/usuario/edit/{id}", method = RequestMethod.GET)
	public String formularioEditar(Model model, @PathVariable() int id) {
		LOG.info("Entrando en admin");
		
		model.addAttribute("usuario", this.serviceUsuario.buscarPorId(id));
		return "admin/form";
	}
	
	@RequestMapping(value = "usuario/crear", method = RequestMethod.POST)
	public String crear(Model model, Usuario u) {
		LOG.info("Entrando en admin");
		
		if (u.getId() == -1) {
			this.serviceUsuario.crear(u);
		} else {
			this.serviceUsuario.modificar(u);
		}
		
		model.addAttribute("usuario", this.serviceUsuario.buscarPorId(u.getId()));
		return "admin/form";
	}
	
	/**
	 * Modificar el estado del usuario a alta o baja
	 * @param model atributos para la vista
	 * @param u usuario a modificar
	 * @return vista del formulario
	 */
	@RequestMapping(value = "usuario/altasbajas", method = RequestMethod.POST)
	public String altaBaja(Model model, Usuario u) {
		LOG.info("Entrando en admin");
		
		if (u.getFechaBaja().equals("")) {
			this.serviceUsuario.darBaja(u.getId());
		} else {
			this.serviceUsuario.darAlta(u.getId());
		}
		model.addAttribute("usuario", this.serviceUsuario.buscarPorId(u.getId()));
		return "admin/form";
	}
	
	@RequestMapping(value = "usuario/eliminar", method = RequestMethod.POST)
	public String eliminar(Model model, Usuario u) {
		LOG.info("Entrando en admin");
		this.serviceUsuario.eliminar(u.getId());
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("usuarios", this.serviceUsuario.listar());
		return "admin/index";
	}

	
}
