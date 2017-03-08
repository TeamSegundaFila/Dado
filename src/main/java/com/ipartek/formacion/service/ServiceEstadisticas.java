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
	 * Método que devuelve una lis de objetos Estadástica (uno por entrada en la
	 * BBDD)
	 * 
	 * @return - lista de objetos Estadástica
	 */
	List<Estadistica> getEstadisticas();

	/**
	 * Método que devuelve una lista de objetos Estadástica (uno por entrada en
	 * la BBDD)
	 * 
	 * @return - lista de objetos Estadástica
	 */
	List<Estadistica> getEstadisticasTotales();

	/**
	 * Metodo que devuelve el total de lanzamientos de dado registrados en la
	 * BBDD
	 * 
	 * @return - integer con el total de lanzamientos
	 */
	int total();

	/**
	 * Método que devueve una lista de los últimos lanzamientos de dado
	 * @param n entero
	 * @return - listado de objetos Lanzamientos
	 */
	List<Lanzamientos> getUltimos(int n);
	/**
	 * Devuelve los ultimos 500 lanzamientos (si es que los hay)
	 * @return List<Lanzamientos> en un arrayList
	 */
	List<Lanzamientos> getAllLanzamientos();

}
