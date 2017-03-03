package com.ipartek.formacion.domain;

public class Usuario {
	
	private long id;
	private String nombre;
	private String fechaAlta;
	private String fechaModificacion;
	private String fechaBaja;
	
	
	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		this.fechaAlta = null;
		this.fechaModificacion = null;
		this.fechaBaja = null;
	}

	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	


	public String getFechaAlta() {
		return fechaAlta;
	}



	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public String getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public String getFechaBaja() {
		return fechaBaja;
	}



	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaAlta=" + fechaAlta + ", fechaModificacion=" + fechaModificacion
				+ ", fechaBaja=" + fechaBaja + "]";
	}
	
	

}
