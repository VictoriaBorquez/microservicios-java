package com.pep3.calcularNuevosPrecios.Model;

public class Producto {

	private int id;
	private String nombre;
	private float precio_peso;
	private float precio_dolar;
	private float precio_euro;
	
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
	public float getPrecio_peso() {
		return precio_peso;
	}
	public void setPrecio_peso(float precio_peso) {
		this.precio_peso = precio_peso;
	}
	public float getPrecio_dolar() {
		return precio_dolar;
	}
	public void setPrecio_dolar(float precio_dolar) {
		this.precio_dolar = precio_dolar;
	}
	public float getPrecio_euro() {
		return precio_euro;
	}
	public void setPrecio_euro(float precio_euro) {
		this.precio_euro = precio_euro;
	}
}
