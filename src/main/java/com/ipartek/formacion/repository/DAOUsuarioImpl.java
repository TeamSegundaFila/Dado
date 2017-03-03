package com.ipartek.formacion.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.domain.Usuario;
import com.ipartek.formacion.repository.mapper.UsuarioMapper;

@Repository("daoUsuario")
public class DAOUsuarioImpl implements DAOUsuario {

	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDatasource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	private static final String SQL_GET_ALL = "SELECT `id`, `nombre`, `fecha_alta`, `fecha_modificacion`, `fecha_baja` FROM `usuario` ORDER BY `id` DESC LIMIT 500;";
	private static final String SQL_GET_BY_ID = "SELECT `id`, `nombre`, `fecha_alta`, `fecha_modificacion`, `fecha_baja` FROM `usuario` WHERE `id` = ?";
	private static final String SQL_INSERT = "INSERT INTO `usuario` (`nombre`) VALUES (?);";
	private static final String SQL_UPDATE = "UPDATE `usuario` SET `nombre`= ?, `fecha_modificacion`= CURRENT_TIMESTAMP WHERE `id`= ? ;";
	private static final String SQL_DELETE = "DELETE FROM `usuario` WHERE `id` = ?;";
	private static final String SQL_BAJA_USUARIO = "UPDATE `usuario` SET `fecha_modificacion`= CURRENT_TIMESTAMP , `fecha_baja`= CURRENT_TIMESTAMP WHERE `id`= ? ;";
	private static final String SQL_ALTA_USUARIO = "UPDATE `usuario` SET  `fecha_modificacion`= CURRENT_TIMESTAMP , `fecha_baja`= null WHERE `id`= ? ;";
	private static final String SQL_GET_ALL_ALTAS = "SELECT `id`, `nombre`, `fecha_alta`, `fecha_modificacion`, `fecha_baja` FROM `usuario` WHERE `fecha_baja` IS NULL  ORDER BY `id` DESC LIMIT 500;";
	
	@Override
	public List<Usuario> getAll() {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		try {
			lista = (ArrayList<Usuario>) this.jdbcTemplate.query(SQL_GET_ALL, new UsuarioMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen usuarios todavia");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}

	@Override
	public List<Usuario> getAllUsuariosDeAlta() {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		try {
			lista = (ArrayList<Usuario>) this.jdbcTemplate.query(SQL_GET_ALL_ALTAS,new UsuarioMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen usuarios todavia");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}
	
	@Override
	public Usuario getById(long id) {
		Usuario u = null;
		try {
			u = this.jdbcTemplate.queryForObject(SQL_GET_BY_ID, new Object[] { id }, new UsuarioMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen usuarios todavia");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}

		return u;
	}

	@Override
	public boolean insert(final Usuario u) {
		boolean resul = false;
		try {
			int affectedRows = -1;
			KeyHolder keyHolder = new GeneratedKeyHolder();

			affectedRows = this.jdbcTemplate.update(new PreparedStatementCreator() {
				@Override
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
					final PreparedStatement ps = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
					ps.setString(1, u.getNombre());
					return ps;
				}
			}, keyHolder);

			if (affectedRows == 1) {
				resul = true;
				u.setId(keyHolder.getKey().longValue());
			}

		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return resul;
	}

	@Override
	public boolean update(Usuario u) {
		boolean resul = false;
		int affectedRows = -1;
		try {
			Object[] argumentos = { u.getNombre(), u.getId() };
			affectedRows = this.jdbcTemplate.update(SQL_UPDATE, argumentos);
			if (affectedRows == 1) {
				resul = true;
			}
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return resul;
	}

	@Override
	public boolean delete(long id) {
		boolean resul = false;
		try {
			int affectedRows = this.jdbcTemplate.update(SQL_DELETE, id);
			if (affectedRows == 1) {
				resul = true;
			}
		} catch (DataIntegrityViolationException e) {
			this.logger.warn(e.getMessage());
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return resul;
	}

	@Override
	public boolean darBaja(long id) {
		boolean resul = false;
		try {
			int affectedRows = this.jdbcTemplate.update(SQL_BAJA_USUARIO, id);
			if (affectedRows == 1) {
				resul = true;
			}
		} catch (DataIntegrityViolationException e) {
			this.logger.warn(e.getMessage());
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return resul;
	}

	@Override
	public boolean darAlta(long id) {
		boolean resul = false;
		try {
			int affectedRows = this.jdbcTemplate.update(SQL_ALTA_USUARIO, id);
			if (affectedRows == 1) {
				resul = true;
			}
		} catch (DataIntegrityViolationException e) {
			this.logger.warn(e.getMessage());
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return resul;
	}

}
