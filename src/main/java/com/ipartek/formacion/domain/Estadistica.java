package com.ipartek.formacion.domain;
/**
 * Clase estadistica
 * @author Curso
 *
 */
public class Estadistica {

	private String nombre;
	private int contador;
	private int probabilidad;
	/**
	 * Creador estadistica
	 */
	public Estadistica() {
		super();
		this.nombre = "";
		this.contador = -1;
		this.probabilidad = 0;
	}
	/**
	 * Getter del nombre
	 * @return nombre
	 */
	public String getNombre() {
		return this.nombre;
	}
	/** 
	 * setter del nombre
	 * @param nombre usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * getter contador
	 * @return contador
	 */
	public int getContador() {
		return this.contador;
	}
	/**
	 * setter contador
	 * @param contador de lanzamientos
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}
	/**
	 * getter Probabilidad
	 * @return probabilidad
	 */
	public int getProbabilidad() {
		return this.probabilidad;
	}
	/**
	 * setter probabilidad
	 * @param probabilidad %
	 */
	public void setProbabilidad(int probabilidad) {
		this.probabilidad = probabilidad;
	}
	@Override()
	public String toString() {
		return "Estadistica [nombre=" + this.nombre + ", contador=" + this.contador + "]";
	}
	
}
