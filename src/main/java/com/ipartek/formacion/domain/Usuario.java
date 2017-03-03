package com.ipartek.formacion.domain;

import java.sql.Date;

public class Usuario {
	
	private long id;
	private String nombre;
	private Date fechaAlta;
	private Date fechaModificacion;
	private Date fechaBaja;
	
	
	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		this.fechaAlta = new Date(0);
		this.fechaModificacion = new Date(0);
		this.fechaBaja = new Date(0);
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


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public Date getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public Date getFechaBaja() {
		return fechaBaja;
	}


	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaAlta=" + fechaAlta + ", fechaModificacion=" + fechaModificacion
				+ ", fechaBaja=" + fechaBaja + "]";
	}
	
	

}
