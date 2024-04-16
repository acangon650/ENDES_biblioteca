package com.endes.biblioteca;

import java.util.List;

/**
 * Representa a un autor de libros dentro de un sistema de gestión de biblioteca.
 * 
 * 
 * @author Agustín
 * @version 1.0
 */

public class Autor {
    private String name;
    private String biography;
    private List<Libro> librosEscritos;
        
	public Autor(String name, String biography) {
		super();
		this.name = name;
		this.biography = biography;
	}

	/**
     * Obtiene la lista de libros escritor por el autor.
     * 
     * @return Una lista de objetos {@link Libro} que representa los libros escritor por el autor.
     */
	
	public List<Libro> getLibrosEscritos() {
		return librosEscritos;
	}

	/**
	 * Establece la lista de libros escritor por el autor.
	 * 
	 * @param librosEscritos Una lista de objetos {@link Libro} que representa los libros escritos por el autor.
	 */

	public void setLibrosEscritos(List<Libro> librosEscritos) {
		this.librosEscritos = librosEscritos;
	}

	/**
	 * Obtiene el nombre del autor.
	 * @return El nombre del autor.
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}	
    // Constructor, getters y setters aquí
}
