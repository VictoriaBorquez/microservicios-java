package com.pep3.calcularNuevosPrecios.Model;

public class Producto {

	private int id;
	private String nombre;
	private int precio_peso;
	private int precio_dolar;
	private int precio_euro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio_peso() {
		return precio_peso;
	}
	public void setPrecio_peso(int precio_peso) {
		this.precio_peso = precio_peso;
	}
	public int getPrecio_dolar() {
		return precio_dolar;
	}
	public void setPrecio_dolar(int precio_dolar) {
		this.precio_dolar = precio_dolar;
	}
	public int getPrecio_euro() {
		return precio_euro;
	}
	public void setPrecio_euro(int precio_euro) {
		this.precio_euro = precio_euro;
	}
}
