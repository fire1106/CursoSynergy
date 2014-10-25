/**
 * Libro.java
 * Copyright (c) SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software pueder ser mofificado ó utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.bookmule.core.domain;

import java.io.Serializable;
import java.util.List;

import com.synergyj.bookmule.core.domain.catalog.Categoria;
import com.synergyj.bookmule.core.domain.catalog.StatusLibro;

/**
 * Entidad que contiene los atributos de los libros
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class Libro implements Serializable {

	private static final long serialVersionUID = -3931471178684369899L;

	private Long id;

	private String titulo;

	private List<Autor> autores;

	private Editorial editorial;

	private Integer edicion;

	private String isbn;

	private String codigoColor;

	private String codigoClasificacion;

	private Integer numeroEjemplares;

	private Float precioVenta;

	private List<Categoria> categorias;

	private StatusLibro statusLibro;

	private List<Proveedor> proovedores;

	private List<byte[]> imagenes;

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id para inicializar el atributo id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo para inicializar el atributo titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return autores
	 */
	public List<Autor> getAutores() {
		return autores;
	}

	/**
	 * @param autores para inicializar el atributo autores
	 */
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	/**
	 * @return editorial
	 */
	public Editorial getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial para inicializar el atributo editorial
	 */
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return edicion
	 */
	public Integer getEdicion() {
		return edicion;
	}

	/**
	 * @param edicion para inicializar el atributo edicion
	 */
	public void setEdicion(Integer edicion) {
		this.edicion = edicion;
	}

	/**
	 * @return isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn para inicializar el atributo isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return codigoColor
	 */
	public String getCodigoColor() {
		return codigoColor;
	}

	/**
	 * @param codigoColor para inicializar el atributo codigoColor
	 */
	public void setCodigoColor(String codigoColor) {
		this.codigoColor = codigoColor;
	}

	/**
	 * @return codigoClasificacion
	 */
	public String getCodigoClasificacion() {
		return codigoClasificacion;
	}

	/**
	 * @param codigoClasificacion para inicializar el atributo codigoClasificacion
	 */
	public void setCodigoClasificacion(String codigoClasificacion) {
		this.codigoClasificacion = codigoClasificacion;
	}

	/**
	 * @return numeroEjemplares
	 */
	public Integer getNumeroEjemplares() {
		return numeroEjemplares;
	}

	/**
	 * @param numeroEjemplares para inicializar el atributo numeroEjemplares
	 */
	public void setNumeroEjemplares(Integer numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	/**
	 * @return precioVenta
	 */
	public Float getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta para inicializar el atributo precioVenta
	 */
	public void setPrecioVenta(Float precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return categorias
	 */
	public List<Categoria> getCategorias() {
		return categorias;
	}

	/**
	 * @param categorias para inicializar el atributo categorias
	 */
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	/**
	 * @return statusLibro
	 */
	public StatusLibro getStatusLibro() {
		return statusLibro;
	}

	/**
	 * @param statusLibro para inicializar el atributo statusLibro
	 */
	public void setStatusLibro(StatusLibro statusLibro) {
		this.statusLibro = statusLibro;
	}

	/**
	 * @return proovedores
	 */
	public List<Proveedor> getProovedores() {
		return proovedores;
	}

	/**
	 * @param proovedores para inicializar el atributo proovedor
	 */
	public void setProovedores(List<Proveedor> proovedores) {
		this.proovedores = proovedores;
	}

	/**
	 * @return imagenes
	 */
	public List<byte[]> getImagenes() {
		return imagenes;
	}

	/**
	 * @param imagenes para inicializar el atributo imagenes
	 */
	public void setImagenes(List<byte[]> imagenes) {
		this.imagenes = imagenes;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [id=");
		builder.append(id);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", autores=");
		builder.append(autores);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append(", edicion=");
		builder.append(edicion);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", codigoColor=");
		builder.append(codigoColor);
		builder.append(", codigoClasificacion=");
		builder.append(codigoClasificacion);
		builder.append(", numeroEjemplares=");
		builder.append(numeroEjemplares);
		builder.append(", precioVenta=");
		builder.append(precioVenta);
		builder.append(", categorias=");
		builder.append(categorias);
		builder.append(", statusLibro=");
		builder.append(statusLibro);
		builder.append(", proovedores=");
		builder.append(proovedores);
		builder.append(", imagenes=");
		builder.append(imagenes);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Libro libro;

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		libro = (Libro) obj;

		if (id != null && libro.id != null && id.equals(libro.id)) {
			return true;
		} else if (isbn != null && libro.isbn != null && isbn.equals(libro.isbn)) {
			return true;
		}
		return false;
	}

}
