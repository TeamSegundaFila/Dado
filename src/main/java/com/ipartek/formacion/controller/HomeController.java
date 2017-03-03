package com.ipartek.formacion.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipartek.formacion.domain.Tirada;
import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.service.ServiceTirada;
import com.ipartek.formacion.service.ServiceUsuario;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	ServiceUsuario serviceUsuario;
	
	@Autowired
	ServiceTirada serviceTirada;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		model.addAttribute("estadisticas", serviceTirada.getEstadisticas() );
		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/lanzar", method = RequestMethod.GET)
	public String tirarDado(Locale locale, Model model) {
		logger.info("Lanzar dado");

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		Usuario afortunado = serviceUsuario.LanzarDado();
		Tirada t = new Tirada();
		t.setUsuarioId(afortunado.getId());
		serviceTirada.crear(t);
		model.addAttribute("afortunado",afortunado.getNombre());
		model.addAttribute("estadisticas", serviceTirada.getEstadisticas() );

		return "home";
	}

	@RequestMapping(value = "/estadisticas", method = RequestMethod.GET)
	public String listarEstadisticas(Model model) {
		logger.info("Listando p�gina de estadisticas");

		return "estadisticas";
	}

}
