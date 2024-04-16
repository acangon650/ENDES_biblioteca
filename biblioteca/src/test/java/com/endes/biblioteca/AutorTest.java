package com.endes.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class AutorTest {
	
	private Autor autor;
	private List<Libro> libros;
	
	@BeforeEach
	public void setUp() {
		autor=new Autor("Gabriel García","Escritor colomniano");
		
		libros=new ArrayList<>();
		libros.add(new EjemplarLibro("Cien alos de soledad"));
		libros.add(new EjemplarLibro("El amor en tiempos del cólera"));
		autor.setLibrosEscritos(libros);
	}
	
    @Test
    @DisplayName("Obtener Nombre del autor")
    public void testGetName() {
    	assertEquals("Gabriel García", autor.getName());
    }
    
    @Test
    @DisplayName("Obtener biografia del autor")
    public void testGetBiography() {
    	assertEquals("Escritor colomniano", autor.getBiography());
    }
    
    @Test
    @DisplayName("Obtener libros escritos por el autor")
    public void testGetLibrosEscritos() {
    	assertNotNull(autor.getLibrosEscritos());
    	assertEquals(2, autor.getLibrosEscritos().size());
    	assertEquals("Cien alos de soledad", autor.getLibrosEscritos().get(0).getTitle());
    	assertEquals("El amor en tiempos del cólera", autor.getLibrosEscritos().get(1).getTitle());
    }
}
