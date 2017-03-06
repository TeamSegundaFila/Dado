package com.ipartek.formacion.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.domain.Lanzamientos;

/**
 * Mapeador del resulset a un objeto Lanzamiento
 * 
 * @author Curso
 *
 */
public class LanzamientoMapper implements RowMapper<Lanzamientos> {

	@Override()
	public Lanzamientos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lanzamientos l = new Lanzamientos();
		l.setId(rs.getLong("id"));
		l.setNombre(rs.getString("nombre"));
		l.setFecha(rs.getString("fecha"));
		return l;
	}
}
