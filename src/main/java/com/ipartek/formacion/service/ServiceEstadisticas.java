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
	 * Método que devuelve una lis de objetos Estadística (uno por entrada en la
	 * BBDD)
	 * 
	 * @return - lista de objetos Estadística
	 */
	List<Estadistica> getEstadisticas();

	/**
	 * Método que devuelve una lista de objetos Estadística (uno por entrada en
	 * la BBDD)
	 * 
	 * @return - lista de objetos Estadística
	 */
	List<Estadistica> getEstadisticasTotales();

	/**
	 * Método que devuelve el total de lanzamientos de dado registrados en la
	 * BBDD
	 * 
	 * @return - integer con el total de lanzamientos
	 */
	int total();

	/**
	 * Método que devueve una lista de los 5 últimos lanzamientos
	 * 
	 * @return - listado de objetos Lanzamientos
	 */
	List<Lanzamientos> getUltimos();

	/**
	 * Método que devueve una lista de los n últimos lanzamientos de dado
	 * 
	 * @return - listado de objetos Lanzamientos
	 */
	List<Lanzamientos> getUltimos(int n);

}
