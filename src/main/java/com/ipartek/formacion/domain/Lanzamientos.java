package com.ipartek.formacion.domain;

public class Lanzamientos {
	
	private long id;
	private String nombre;
	private String fecha;
	public Lanzamientos() {
		super();
		this.id = -1;
		this.nombre = "";
		this.fecha = "";
	}
	
	public long getId() {
		return this.id;
	}



	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return this.fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override()
	public String toString() {
		return "Lanzamientos [id=" + this.id + ", nombre=" + this.nombre + ", fecha=" + this.fecha + "]";
	}

	

}
