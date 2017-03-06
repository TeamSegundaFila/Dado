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


	


	public String getFechaAlta() {
		return this.fechaAlta;
	}



	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public String getFechaModificacion() {
		return this.fechaModificacion;
	}



	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public String getFechaBaja() {
		return this.fechaBaja;
	}



	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}



	@Override()
	public String toString() {
		return "Usuario [nombre=" + this.nombre + ", fechaAlta=" + this.fechaAlta + ", fechaModificacion=" + this.fechaModificacion
				+ ", fechaBaja=" + this.fechaBaja + "]";
	}
	
	

}
