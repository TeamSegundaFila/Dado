package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Tirada;

/**
 * Interfaz del servicio de Tirada
 * 
 * @author Curso
 *
 */
public interface ServiceTirada {

	/**
	 * Método que devuelve una lista con el total de objetos Tirada
	 * 
	 * @return - listado de objetos Tirada
	 */
	List<Tirada> listar();

	/**
	 * Método que devuelve una lista con el total de objetos Tirada asociados a
	 * una id de usuario
	 * 
	 * @param idUsuario
	 *            parametro que identifica al usuario en la BBDD
	 * @return - listado de objetos Tirada
	 */
	List<Tirada> listarPorUsuario(long idUsuario);

	/**
	 * Metodo que devuelve un objeto Tirada de la BBDD, a partir del id asociado
	 * a su entrada
	 * 
	 * @param id
	 *            parametro que identifica a una tirada en la BBDD
	 * @return - un objeto Tirada
	 */
	Tirada buscarPorId(long id);

	/**
	 * Metodo que toma un objeto Tirada y crea (inserta) una entrada de Tirada
	 * en la BBDD. Devielve True si la inserción es exitosa o false en caso
	 * contrario
	 * 
	 * @param t
	 *            parametro de input, el objeto Tirada a insertar en la BBDD
	 * @return - booleano
	 */
	boolean crear(Tirada t);

	/**
	 * Metodo que toma un objeto Tirada y modifica una entrada de Tirada en la
	 * BBDD. Devuelve True si la modificación es exitosa o false en caso
	 * contrario
	 * 
	 * @param t
	 *            parametro de input, el objeto Tirada a modificar en la BBDD
	 * @return - booleano
	 */
	boolean modificar(Tirada t);

	/**
	 * Metodo que toma el número long identificativo de una Tirada y elimian la
	 * entrada correspondiente en la BBDD. Devuelve True si la eliminación es
	 * exitosa o false en caso contrario
	 * 
	 * @param id
	 *            parametro de input, el long que identifica la entrada de
	 *            Tirada a eliminar de la BBDD
	 * @return - booleano
	 */
	boolean eliminar(long id);

}
