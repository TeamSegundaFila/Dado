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
	 * @param ds
	 */
	void setDatasource(DataSource ds);
	/**
	 * Muestra listado tiradas
	 * @return List<Tirada>
	 */
	List<Tirada> getAll();
	/**
	 * Muesta listado de tiradas de un usuario especifico
	 * @param idUsuario
	 * @return List<Tirada>
	 */
	List<Tirada> getAllByUser(long idUsuario);
	/**
	 * Consigue una tirada por id
	 * @param id
	 * @return Tirada
	 */
	Tirada getById(long id);
	/**
	 * Inserta una tirada
	 * @param t
	 * @return verdadero si lo consigue, falso en caso contrario
	 */
	boolean insert(Tirada t);
	/**
	 * modifica una tirada
	 * @param t
	 * @return verdadero si lo consigue, falso en caso contrario
	 */
	boolean update(Tirada t);
	/**
	 * borra la tirada
	 * @param id
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
	 * Muestra las ultimas 5 tiradas 
	 * @return arrayList de 5 tiradas
	 */
	List<Lanzamientos> getUltimos();
	/**
	 * Muestras la ultimas n tiradas
	 * @param n
	 * @return arrayList de n tiradas
	 */
	List<Lanzamientos> getUltimos(int n);

}
