package com.ipartek.formacion.domain;
/**
 * Clases lanzamientos
 * @author Curso
 *
 */
public class Lanzamientos {
	
	private long id;
	private String nombre;
	private String fecha;
	/**
	 * Constructor lanzamientos
	 */
	public Lanzamientos() {
		super();
		this.id = -1;
		this.nombre = "";
		this.fecha = "";
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
	 * @param id
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
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * getter fecha
	 * @return fecha
	 */
	public String getFecha() {
		return this.fecha;
	}
	/**
	 * setter fecha
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override()
	public String toString() {
		return "Lanzamientos [id=" + this.id + ", nombre=" + this.nombre + ", fecha=" + this.fecha + "]";
	}

	

}
