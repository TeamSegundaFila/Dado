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
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContador() {
		return this.contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override()
	public String toString() {
		return "Estadistica [nombre=" + this.nombre + ", contador=" + this.contador + "]";
	}
	
}
