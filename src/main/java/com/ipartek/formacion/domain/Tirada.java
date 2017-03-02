package com.ipartek.formacion.domain;

import java.sql.Date;

public class Tirada {

	private long id;
	private Date fechaLanzamiento;
	private long usuarioId;
	
	public Tirada() {
		super();
		this.id = -1;
		this.fechaLanzamiento = null;
		this.usuarioId = -1;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioid) {
		this.usuarioId = usuarioid;
	}

	@Override
	public String toString() {
		return "Tirada [id=" + id + ", fechaLanzamiento=" + fechaLanzamiento + ", usuarioid=" + usuarioId + "]";
	}
	
	
}
