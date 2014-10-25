/**
 * 
 */
package com.synergyj.bookmule.persistence;

import java.util.Set;

import com.synergyj.bookmule.core.domain.Libro;

/**
 * @author JosédeJesús
 *
 */
public interface LibroDAO {
	
	/**
	 * Este metodo persistira un libro
	 * @param libro
	 */
	void crea(Libro libro);
	
	/**
	 * Busca un conjunto de libros de acuerdo al criterio de un libro
	 * @param libro
	 * @return
	 */
	Set<Libro> busca(Libro libro);
	

}
