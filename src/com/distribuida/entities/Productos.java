package com.distribuida.entities;

public class Productos {

	//Atributos
	private int id_producto;
	private String nombre_producto;
	private String descripcion;
	private double precio;
	private int stock;
	
	//Metodos Getter and Setter
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Productos [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", descripcion="
				+ descripcion + ", precio=" + precio + ", stock=" + stock + "]";
	}

}
