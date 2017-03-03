package com.ipartek.formacion.domain;

public class Estadistica {

	private String nombre;
	private int contador;
	
	public Estadistica() {
		super();
		this.nombre = "";
		this.contador = -1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "Estadistica [nombre=" + nombre + ", contador=" + contador + "]";
	}
	
}
