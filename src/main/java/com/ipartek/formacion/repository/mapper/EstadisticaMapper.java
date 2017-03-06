package com.ipartek.formacion.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.domain.Estadistica;

/**
 * Mapeador del resulset un objeto Estadistica
 * 
 * @author Curso
 *
 */
public class EstadisticaMapper implements RowMapper<Estadistica> {

	@Override()
	public Estadistica mapRow(ResultSet rs, int rowNum) throws SQLException {
		Estadistica e = new Estadistica();

		e.setNombre(rs.getString("nombre"));
		e.setContador(rs.getInt("lanzamientos"));
		return e;
	}

}
