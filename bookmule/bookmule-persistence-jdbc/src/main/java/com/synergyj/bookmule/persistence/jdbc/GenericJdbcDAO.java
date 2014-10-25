package com.synergyj.bookmule.persistence.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class GenericJdbcDAO extends JdbcDaoSupport {
	
	/**
	 * Estamos inyectando el bean <b>dataSource</b> declarado en el applicationContenx
	 * @param dataSource
	 */
	@Autowired
	public void setJdbcDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}

}
