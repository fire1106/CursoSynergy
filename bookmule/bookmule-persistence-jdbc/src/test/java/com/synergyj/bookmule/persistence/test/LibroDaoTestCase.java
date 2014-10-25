/**
 * 
 */
package com.synergyj.bookmule.persistence.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.synergyj.bookmule.core.domain.Editorial;
import com.synergyj.bookmule.core.domain.Libro;
import com.synergyj.bookmule.core.domain.catalog.StatusLibro;
import com.synergyj.bookmule.persistence.LibroDAO;

/**
 * @author JosédeJesús
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/jdbcApplicationContext.xml")
@TransactionConfiguration(defaultRollback=true)//Con esto borra todas las transacciones echas en las prubas
public class LibroDaoTestCase extends AbstractTransactionalJUnit4SpringContextTests  {
	
	Logger logger = LoggerFactory.getLogger(LibroDaoTestCase.class);
	
	@Autowired
	LibroDAO libroDAO;

	@Test
	public void testSaveLibro() {

		assertNotNull(libroDAO);
		Libro libro = construyeLibro();
		libroDAO.crea(libro);
		assertNotNull(libro.getId());
		logger.debug("Llave primaria es: {}",libro.getId());
		
	}
	
	private Libro construyeLibro(){
		Libro libro = new Libro();
		Editorial editorial;
		libro.setCodigoClasificacion("B034");
		libro.setCodigoColor("002343");
		libro.setCodigoClasificacion("WL0092");
		libro.setEdicion(1);
		editorial = new Editorial();
		editorial.setId(1L);
		libro.setEditorial(editorial);
		libro.setIsbn("9788481812275");
		libro.setNumeroEjemplares(1);
		libro.setPrecioVenta(new Float(234.56));
		libro.setStatusLibro(StatusLibro.DISPONIBLE);
		libro.setTitulo("100 años de Soledad");
		return libro;
	}

}
