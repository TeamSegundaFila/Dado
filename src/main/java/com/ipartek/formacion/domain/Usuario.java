package com.ipartek.formacion.domain;
/**
 * Clase usuario
 * @author Curso
 *
 */
public class Usuario {
	
	private long id;
	private String nombre;
	private String fechaAlta;
	private String fechaModificacion;
	private String fechaBaja;
	
	/**
	 * Constructor usuario
	 */
	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		this.fechaAlta = null;
		this.fechaModificacion = null;
		this.fechaBaja = null;
	}

	
	/**
	 * getter id
	 * @return id
	 */
	public long getId() {
		return this.id;
	}


	/**
	 * setter id
	 * @param id de usuario
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * getter nombre
	 * @return nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * setter nombre
	 * @param nombre de usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	

	/**
	 * getter fecha de alta	
	 * @return fechaAlta
	 */
	public String getFechaAlta() {
		return this.fechaAlta;
	}


	/**
	 * setter fechaAlta
	 * @param fechaAlta del usuario
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	/**
	 * getter fecha de modificacion
	 * @return fechamodificacion
	 */
	public String getFechaModificacion() {
		return this.fechaModificacion;
	}


	/**
	 * setter fecha de modificacion
	 * @param fechaModificacion del usuario
	 */
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	/**
	 * getter fecha de baja
	 * @return fechaBaja
	 */
	public String getFechaBaja() {
		return this.fechaBaja;
	}


	/**
	 * setter fecha de baja
	 * @param fechaBaja del usuario
	 */
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}



	@Override()
	public String toString() {
		return "Usuario [nombre=" + this.nombre + ", fechaAlta=" + this.fechaAlta + ", fechaModificacion=" + this.fechaModificacion
				+ ", fechaBaja=" + this.fechaBaja + "]";
	}
	
	

}
