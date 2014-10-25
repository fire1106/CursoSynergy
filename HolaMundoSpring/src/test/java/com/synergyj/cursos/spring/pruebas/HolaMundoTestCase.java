package com.synergyj.cursos.spring.pruebas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author JosédeJesús
 *
 */
public class HolaMundoTestCase {

	//Bitacora
	private static final Logger logger = LoggerFactory.getLogger(HolaMundoTestCase.class);
	
	ApplicationContext context;
	
	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void saluda(){
		String bean;
		
		//Validamos que este inicializado el context
		Assert.assertNotNull(context);
		
		//Obtenemos la clase del contex
		bean = context.getBean("saludoBean",String.class);
		
		//Validamos que la clase string se inicialice con el valor indicado
		Assert.assertEquals("Hola Mundo nuevo de Spring", bean);
		
		//Imprimimos el mensaje en bitacora
		logger.debug("Mensaje del dia {}",bean);
		
		
	}
}
