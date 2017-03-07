package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.domain.Lanzamientos;

/**
 * Interfaz del servicio de Estadisticas
 * 
 * @author Curso
 *
 */
public interface ServiceEstadisticas {

	/**
	 * M�todo que devuelve una lis de objetos Estad�stica (uno por entrada en la
	 * BBDD)
	 * 
	 * @return - lista de objetos Estad�stica
	 */
	List<Estadistica> getEstadisticas();

	/**
	 * M�todo que devuelve una lista de objetos Estad�stica (uno por entrada en
	 * la BBDD)
	 * 
	 * @return - lista de objetos Estad�stica
	 */
	List<Estadistica> getEstadisticasTotales();

	/**
	 * M�todo que devuelve el total de lanzamientos de dado registrados en la
	 * BBDD
	 * 
	 * @return - integer con el total de lanzamientos
	 */
	int total();

	/**
	 * M�todo que devueve una lista de los n �ltimos lanzamientos de dado
	 * 
	 * @return - listado de objetos Lanzamientos
	 */
	List<Lanzamientos> getUltimos(int n);

}
