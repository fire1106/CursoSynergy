package com.synergyj.bookmule.persistence.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author JosédeJesús
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/jdbcTestApplicationContext.xml")
public class DataSourceTestCase {

	Logger logger = LoggerFactory.getLogger(DataSourceTestCase.class);
	
	@Autowired
	DataSource dataSource;
	
	@Value("#{propiedades['bd.username']}")
	String usuarioBD;
	
	@Value("#{propiedades['bd.password']}")
	String passwordBD;
	
	@Test
	public void pruebaDataSource() {
		assertNotNull(dataSource);
		//Probamos que exista conexion
		assertNotNull(usuarioBD);
		logger.debug("El usuario de la BD de datos es: {}",usuarioBD);
		assertNotNull(passwordBD);
		logger.debug("El password de la BD de datos es: {}",passwordBD);
		try {
			Connection connection = dataSource.getConnection();
			assertNotNull(connection);
		} catch (SQLException e) {
			logger.error("Hubo un problema en la conexion",e);
			fail("Existio una excepcion.");
		}
	}

}
