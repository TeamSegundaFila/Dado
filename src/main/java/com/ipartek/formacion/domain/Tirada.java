package com.ipartek.formacion.domain;

import java.sql.Date;
/**
 * clase tirada
 * @author Curso
 *
 */
public class Tirada {

	private long id;
	private Date fechaLanzamiento;
	private long usuarioId;
	/**
	 * constructor tirada
	 */
	public Tirada() {
		super();
		this.id = -1;
		this.fechaLanzamiento = null;
		this.usuarioId = -1;
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
	 * @param id de tirada
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * getter fecha lanzamiento
	 * @return fechalanzamiento
	 */
	public Date getFechaLanzamiento() {
		return this.fechaLanzamiento;
	}
	/**
	 * setter fecha lanzamiento
	 * @param fechaLanzamiento del dado
	 */
	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	/**
	 * getter usuario_id
	 * @return usuarioId
	 */
	public long getUsuarioId() {
		return this.usuarioId;
	}
	/**
	 * setter usuario_id
	 * @param usuarioid llave foranea de tirada
	 */
	public void setUsuarioId(long usuarioid) {
		this.usuarioId = usuarioid;
	}

	@Override()
	public String toString() {
		return "Tirada [id=" + this.id + ", fechaLanzamiento=" + this.fechaLanzamiento + ", usuarioid=" + this.usuarioId + "]";
	}
	
	
}
