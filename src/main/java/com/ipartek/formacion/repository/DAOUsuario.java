package com.ipartek.formacion.repository;

import java.util.List;

import javax.sql.DataSource;

import com.ipartek.formacion.domain.Usuario;

/**
 * Interfaz de la DAO (Data Access Object) del Usuario
 * 
 * @author Curso
 *
 */
public interface DAOUsuario {

	/**
	 * Método que setea el datasource :)
	 * 
	 * @param ds
	 *            nos devuelve un objeto datasource
	 */
	void setDatasource(DataSource ds);

	/**
	 * Método que devuelve la lista total de usuarios, tanto dados de alta como
	 * de baja
	 * 
	 * @return - devuelve un Array list de objetos Usuario
	 */
	List<Usuario> getAll();

	/**
	 * Método que devuelve el usuario corrspondiente al input de Id
	 * 
	 * @param id
	 *            P�rametro de input con el numero que identifica al usuario en
	 *            la BBDD
	 * @return - devuelve un objeto Usuario
	 */
	Usuario getById(long id);

	/**
	 * Método que devuelve True si consigue insertar en la BBDD el objeto
	 * Usuario pasado como input, False en caso contrario
	 * 
	 * @param u
	 *            objeto Usuario
	 * @return - devuelve un booleano
	 */
	boolean insert(Usuario u);

	/**
	 * Método que devuelve True si consigue actualizar en la BBDD el objeto
	 * Usuario pasado como input, Falso en caso contrario
	 * 
	 * @param u
	 *            objeto usuario
	 * @return - devuelve un booleano
	 */
	boolean update(Usuario u);

	/**
	 * Método que devuelve True si consigue eliminar de la BBDD la entrada
	 * correspondiente al parametro id pasado como input, Falso en caso
	 * contrario
	 * 
	 * @param id
	 *            variable long que representa el identificador
	 * @return - devuelve un booleano
	 */
	boolean delete(long id);

	/**
	 * Método que devuelve True si consigue dar de baja de la BBDD la entrada
	 * correspondiente al parametro id pasado como input, Falso en caso
	 * contrario
	 * 
	 * @param id
	 *            variable long que representa el identificador
	 * @return - devuelve un booleano
	 */
	boolean darBaja(long id);

	/**
	 * Método que devuelve True si consigue dar de alta de la BBDD la entrada
	 * correspondiente al parametro id pasado como input, Falso en caso
	 * contrario
	 * 
	 * @param id
	 *            variable long que representa el identificador
	 * @return - devuelve un booleano
	 */
	boolean darAlta(long id);

	/**
	 * Método que devuelve la lista total de usuarios dados de alta
	 * 
	 * @return - devuelve una lista de objetos
	 */
	List<Usuario> getAllUsuariosDeAlta();
}
