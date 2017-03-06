package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Usuario;

/**
 * Interfaz del servicio de Usuario
 * 
 * @author Curso
 *
 */
public interface ServiceUsuario {

	/**
	 * Método que lista el total de usuarios guardados en la BBDD
	 * 
	 * @return - lista de objetos Usuario
	 */
	List<Usuario> listar();

	/**
	 * Método que devuelve el objeto Usuario de la BBDD, elegido al azar de
	 * entre todos los usuarios de la BBDD
	 * 
	 * @return - Objeto Usuario escogido de la BBDD
	 */
	Usuario lanzarDado();

	/**
	 * Método que devuelve un objeto Usuario de la BBDD, correspondiente al
	 * parámetro id que se le pasa como input
	 * 
	 * @return - Objeto Usuario escogido de la BBDD
	 */
	Usuario buscarPorId(long id);

	/**
	 * Método que pasa un objeto Usuario al DAO, para que cree una nueva entrada
	 * de Usuario BBDD con los datos de los camppos del objeto Usuario que se
	 * pasa como input. Devuelve un booleano True si se consigue crear la nueva
	 * entrada de usuario, False en caso contrario
	 * 
	 * @param u
	 *            Objeto usuario que se trata de incorporar a la BBDD
	 * @return - una variable booleana
	 */
	boolean crear(Usuario u);

	/**
	 * Método que pasa un objeto Usuario al DAO, para que moddifique una entrada
	 * preexistente de Usuario BBDD con los datos de los campos del objeto
	 * Usuario que se pasa como input. Devuelve un booleano True si se consigue
	 * modificar la entrada de usuario, False en caso contrario
	 * 
	 * @param u
	 *            Objeto usuario que se trata de modificar en la BBDD
	 * @return - una variable booleana
	 */
	boolean modificar(Usuario u);

	/**
	 * Método que pasa un objeto Usuario al DAO, para que elimine una entrada
	 * preexistente de Usuario BBDD a partir de la variable long identificadora
	 * de la entrada de usuario a eliminar que se pasa como input. Devuelve un
	 * booleano True si se consigue eliminar la entrada de usuario, False en
	 * caso contrario
	 * 
	 * @param id
	 *            variable long identificativa de la entrada Usuario a eliminar
	 *            de la BBDD
	 * @return - una variable booleana
	 */
	boolean eliminar(long id);

	/**
	 * Método que pasa un objeto Usuario al DAO, para que de de baja una entrada
	 * preexistente de Usuario BBDD a partir de la variable long identificadora
	 * de la entrada de usuario a dar de baja. Devuelve un booleano True si se
	 * consigue dar de baja la entrada de usuario, False en caso contrario
	 * 
	 * @param id
	 *            variable long identificativa de la entrada Usuario a dar de
	 *            baja en la BBDD
	 * @return - una variable booleana
	 */
	boolean darBaja(long id);

	/**
	 * Método que pasa un objeto Usuario al DAO, para que de de alta una entrada
	 * preexistente de Usuario BBDD a partir de la variable long identificadora
	 * de la entrada de usuario a dar de alta. Devuelve un booleano True si se
	 * consigue dar de alta la entrada de usuario, False en caso contrario
	 * 
	 * @param id
	 *            variable long identificativa de la entrada Usuario a dar de
	 *            alta en la BBDD
	 * @return - una variable booleana
	 */
	boolean darAlta(long id);
}
