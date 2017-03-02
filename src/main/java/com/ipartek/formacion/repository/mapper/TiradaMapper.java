package com.ipartek.formacion.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.formacion.domain.Tirada;

public class TiradaMapper implements RowMapper<Tirada> {

	@Override
	public Tirada mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tirada t = new Tirada();

		t.setId(rs.getLong("id"));
		t.setFechaLanzamiento(rs.getDate("fecha"));
		t.setUsuarioId(rs.getLong("usuarioid"));

		return t;
	}

}
