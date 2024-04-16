package com.endes.biblioteca;

import java.sql.Date;
import java.util.List;

public class EjemplarLibro extends Libro {
	
	private String CodigoDeBarras;
	private Date prestado;
	private Date reservado;

	public EjemplarLibro(String title) {
		super(title);
	}

	public String getCodigoDeBarras() {
		return CodigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		CodigoDeBarras = codigoDeBarras;
	}

	public Date getPrestado() {
		return prestado;
	}

	public void setPrestado(Date prestado) {
		this.prestado = prestado;
	}

	public Date getReservado() {
		return reservado;
	}

	public void setReservado(Date reservado) {
		this.reservado = reservado;
	}
	
	
	
	
}
