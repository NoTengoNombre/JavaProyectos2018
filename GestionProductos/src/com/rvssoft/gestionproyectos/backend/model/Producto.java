package com.rvssoft.gestionproyectos.backend.model;

import java.util.Date;

public class Producto {

	private int codigo;
	private String nombre;
	private Familia familia;
	private Date fechaAlta;
	private double precio;
	private boolean descatalogado;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int codigo, String nombre, Familia familia, Date fechaAlta, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.familia = familia;
		this.fechaAlta = fechaAlta;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	@Override
	public String toString() {
		return "Producto "
		+ "  [codigo=" + getCodigo() 
		+ ", nombre=" + getNombre() 
		+ ", familia=" + getFamilia()
		+ ", fechaAlta=" + getFechaAlta() 
		+ ", precio=" + getPrecio() 
		+ ", descatalogado=" + isDescatalogado()
		+"]";
	}
}
