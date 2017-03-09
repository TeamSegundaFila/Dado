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

import com.ipartek.formacion.domain.Estadistica;
import com.ipartek.formacion.domain.Lanzamientos;
import com.ipartek.formacion.domain.Tirada;
import com.ipartek.formacion.repository.mapper.EstadisticaMapper;
import com.ipartek.formacion.repository.mapper.LanzamientoMapper;
import com.ipartek.formacion.repository.mapper.TiradaMapper;
/**
 * Nombre repositorio
 * @author Curso
 *
 */
@Repository(value ="daoTirada")
public class DAOTiradaImpl implements DAOTirada {

	private final Log logger = LogFactory.getLog(getClass());
	@Autowired()
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Autowired()
	@Override()
	public void setDatasource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}

	private static final String SQL_GET_ALL = "SELECT `id`, `fecha`, `usuario_id` FROM `tirada` ORDER BY `id` DESC LIMIT 500;";
	private static final String SQL_GET_BY_ID = "SELECT `id`, `fecha`, `usuario_id` FROM `usuario` WHERE `id` = ?";
	private static final String SQL_GET_BY_USUARIO_ID = "SELECT `id`, `fecha`, `usuario_id` FROM `tirada` WHERE `usuario_id` = ? ORDER BY `id` DESC LIMIT 500;";
	private static final String SQL_INSERT = "INSERT INTO `tirada` (`usuario_id`) VALUES (?);";
	private static final String SQL_UPDATE = "UPDATE `tirada` SET `usuario_id`= ? WHERE `id`= ? ;";
	private static final String SQL_DELETE = "DELETE FROM `usuario` WHERE `id` = ?;";
	private static final String SQL_GET_ESTADISTICAS_ACTIVAS = "SELECT count(tirada.id) as Lanzamientos, usuario.nombre FROM tirada, usuario WHERE usuario.id = tirada.usuario_id AND usuario.fecha_baja IS NULL GROUP BY usuario.id ORDER BY Lanzamientos DESC, MAX(tirada.fecha) DESC LIMIT 500;";
	private static final String SQL_GET_ESTADISTICAS_TOTALES = "SELECT count(tirada.id) as Lanzamientos, usuario.nombre FROM tirada, usuario WHERE usuario.id = tirada.usuario_id GROUP BY usuario.id ORDER BY Lanzamientos DESC, MAX(tirada.fecha) DESC LIMIT 500;";
	private static final String SQL_COUNT = "SELECT COUNT(id) FROM tirada;";
	private static final String SQL_ULTIMAS_TIRADAS = "SELECT tirada.id, usuario.nombre, tirada.fecha FROM tirada, usuario WHERE usuario.id = tirada.usuario_id ORDER BY fecha DESC, tirada.id DESC LIMIT ?;";
	private static final String SQL_GET_ALL_LANZAMIENTOS = "SELECT tirada.id, usuario.nombre, tirada.fecha FROM tirada, usuario WHERE usuario.id = tirada.usuario_id ORDER BY fecha DESC, tirada.id DESC LIMIT 500;";
	
	@Override()
	public List<Tirada> getAll() {
		ArrayList<Tirada> lista = new ArrayList<Tirada>();
		try {
			lista = (ArrayList<Tirada>) this.jdbcTemplate.query(SQL_GET_ALL, new TiradaMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen tiradas todavia");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}

	@Override()
	public List<Lanzamientos> getAllLanzamientos() {
		ArrayList<Lanzamientos> lista = new ArrayList<Lanzamientos>();
		try {
			lista = (ArrayList<Lanzamientos>) this.jdbcTemplate.query(SQL_GET_ALL_LANZAMIENTOS, new LanzamientoMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen lanzamientos todavia");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}
	
	@Override()
	public List<Tirada> getAllByUser(long idUsuario) {
		ArrayList<Tirada> lista = new ArrayList<Tirada>();
		try {
			lista = (ArrayList<Tirada>) this.jdbcTemplate.query(SQL_GET_BY_USUARIO_ID, new Object[] { idUsuario },
					new TiradaMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen las tiradas del usuario");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}

	@Override()
	public Tirada getById(long id) {
		Tirada t = null;
		try {
			t = this.jdbcTemplate.queryForObject(SQL_GET_BY_ID, new Object[] { id }, new TiradaMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen la tirada");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}

		return t;
	}

	@Override()
	public boolean insert(final Tirada t) {
		boolean resul = false;
		try {
			int affectedRows = -1;
			KeyHolder keyHolder = new GeneratedKeyHolder();

			affectedRows = this.jdbcTemplate.update(new PreparedStatementCreator() {
				@Override()
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
					final PreparedStatement ps = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
					ps.setLong(1, t.getUsuarioId());
					return ps;
				}
			}, keyHolder);

			if (affectedRows == 1) {
				resul = true;
				t.setId(keyHolder.getKey().longValue());
			}

		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return resul;
	}

	@Override()
	public boolean update(Tirada t) {
		boolean resul = false;
		int affectedRows = -1;
		try {
			Object[] argumentos = { t.getUsuarioId() };
			affectedRows = this.jdbcTemplate.update(SQL_UPDATE, argumentos);
			if (affectedRows == 1) {
				resul = true;
			}
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return resul;
	}

	@Override()
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

	@Override()
	public List<Estadistica> getEstadisticas() {
		ArrayList<Estadistica> lista = new ArrayList<Estadistica>();
		try {
			lista = (ArrayList<Estadistica>) this.jdbcTemplate.query(SQL_GET_ESTADISTICAS_ACTIVAS,
					new EstadisticaMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No hay estadisticas");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}

	@Override()
	public List<Estadistica> getEstadisticasTotales() {
		ArrayList<Estadistica> lista = new ArrayList<Estadistica>();
		try {
			lista = (ArrayList<Estadistica>) this.jdbcTemplate.query(SQL_GET_ESTADISTICAS_TOTALES,
					new EstadisticaMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No hay estadisticas totales");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}

	@Override()
	public int total() {
		return this.jdbcTemplate.queryForInt(SQL_COUNT);
	}

	@Override()
	public List<Lanzamientos> getUltimos(int n) {
		ArrayList<Lanzamientos> lista = new ArrayList<Lanzamientos>();
		try {
			lista = (ArrayList<Lanzamientos>) this.jdbcTemplate.query(SQL_ULTIMAS_TIRADAS, new Object[]{ n }, new LanzamientoMapper());
		} catch (EmptyResultDataAccessException e) {
			this.logger.warn("No existen tiradas todavia");
		} catch (Exception e) {
			this.logger.error(e.getMessage());
		}
		return lista;
	}
	
}
