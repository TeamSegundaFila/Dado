package com.ipartek.formacion.repository;

import java.util.List;

import javax.sql.DataSource;

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.domain.Lanzamientos;
import com.ipartek.formacion.domain.Tirada;
/**
 * interface DAOTirada
 * @author Curso
 *
 */
public interface DAOTirada {
	/**
	 * Datasource del dao
	 * @param ds generico
	 */
	void setDatasource(DataSource ds);
	/**
	 * Muestra listado tiradas
	 * @return List<Tirada>
	 */
	List<Tirada> getAll();
	/**
	 * Muesta listado de tiradas de un usuario especifico
	 * @param idUsuario la clave foranea
	 * @return List<Tirada>
	 */
	List<Tirada> getAllByUser(long idUsuario);
	/**
	 * Consigue una tirada por id
	 * @param id de tirada
	 * @return Tirada
	 */
	Tirada getById(long id);
	/**
	 * Inserta una tirada
	 * @param t de clase
	 * @return verdadero si lo consigue, falso en caso contrario
	 */
	boolean insert(Tirada t);
	/**
	 * modifica una tirada
	 * @param t de clase 
	 * @return verdadero si lo consigue, falso en caso contrario
	 */
	boolean update(Tirada t);
	/**
	 * borra la tirada
	 * @param id de tirada
	 * @return verdadero si lo consigue, falso en caso contrario
	 */
	boolean delete(long id);
	/**
	 * Lista las estadisticas de usuarios activos
	 * @return List<Estadistica>
	 */
	List<Estadistica> getEstadisticas();
	/**
	 * Lista las estadisticas totales
	 * @return List<Estadistica>
	 */
	List<Estadistica> getEstadisticasTotales();
	/**
	 * Cuenta el numero total de tiradas
	 * @return total de tiradas
	 */
	int total();
	/**
	 * Muestras la ultimas n tiradas
	 * @param n entero
	 * @return arrayList de n tiradas
	 */
	List<Lanzamientos> getUltimos(int n);
	/**
	 * Muesstra las ultimas 500 lanzamientos
	 * @return ArrayList de lanzamientos
	 */
	List<Lanzamientos> getAllLanzamientos();

}
