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
import com.ipartek.formacion.service.ServiceEstadisticas;
import com.ipartek.formacion.service.ServiceTirada;
import com.ipartek.formacion.service.ServiceUsuario;

/**
 * Handles requests for the application home page.
 * @author Curso
 */
@Controller()
public class HomeController {

	@Autowired()
	private ServiceUsuario serviceUsuario;

	@Autowired()
	private ServiceTirada serviceTirada;

	@Autowired()
	private ServiceEstadisticas serviceEstadisticas;

	private int contadorMagic;
	
	private final static int LIMITE_CONTADOR = 3;

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Pagina Home para lanzar dado y ver rankings
	 * @param locale idioma del navegador del usuario
	 * @param model atributos para la vista
	 * @return vista home.jsp
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		LOG.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		this.contadorMagic = 1;
		String formattedDate = dateFormat.format(date);
		model.addAttribute("estadisticas", this.serviceEstadisticas.getEstadisticas());
		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("contadorMagic", this.contadorMagic);

		return "home";
	}
	/**
	 * Lanza el dado y escoge una persona activa
	 * @param locale
	 * @param model
	 * @return home.jsp
	 */
	@RequestMapping(value = "/lanzar", method = RequestMethod.GET)
	public String tirarDado(Locale locale, Model model) {
		LOG.info("Lanzar dado");

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		Usuario afortunado = this.serviceUsuario.lanzarDado();
		Tirada t = new Tirada();
		t.setUsuarioId(afortunado.getId());

		this.serviceTirada.crear(t);
		model.addAttribute("afortunado", afortunado.getNombre());
		model.addAttribute("estadisticas", this.serviceEstadisticas.getEstadisticas());
		model.addAttribute("ultimos", this.serviceEstadisticas.getUltimos(this.contadorMagic));
		model.addAttribute("contadorMagic", this.contadorMagic);

		if (this.contadorMagic < LIMITE_CONTADOR) {
			this.contadorMagic++;
		}

		return "home";
	}
	/**
	 * Carga las estadisticas de las tiradas
	 * @param model
	 * @return estadisticas.jsp
	 */
	@RequestMapping(value = "/estadisticas", method = RequestMethod.GET)
	public String listarEstadisticas(Model model) {
		LOG.info("Listando página de estadisticas");

		model.addAttribute("estadisticas", this.serviceEstadisticas.getEstadisticas());
		model.addAttribute("estadisticasTotales", this.serviceEstadisticas.getEstadisticasTotales());
		model.addAttribute("total", this.serviceEstadisticas.total());
		model.addAttribute("ultimos", this.serviceEstadisticas.getUltimos());
		return "estadisticas";
	}

}
