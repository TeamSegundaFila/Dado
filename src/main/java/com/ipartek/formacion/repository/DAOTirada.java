package com.ipartek.formacion.repository;

import java.util.List;

import javax.sql.DataSource;

import com.ipartek.formacion.domain.Tirada;

public interface DAOTirada {

	void setDatasource(DataSource ds);

	List<Tirada> getAll();

	List<Tirada> getAllByUser(long idUsuario);

	Tirada getById(long id);

	boolean insert(Tirada t);

	boolean update(Tirada t);

	boolean delete(long id);

}
