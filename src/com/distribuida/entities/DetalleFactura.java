package com.distribuida.entities;

public class DetalleFactura {

	//Atributos
	private int id_detallefactura;
	private int cantidad;
	private double subtotal;
	private Productos productos;
	
	//Metodos_Getter and Setter
	public int getId_detallefactura() {
		return id_detallefactura;
	}
	public void setId_detallefactura(int id_detallefactura) {
		this.id_detallefactura = id_detallefactura;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Productos getProductos() {
		return productos;
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		return "DetalleFactura [id_detallefactura=" + id_detallefactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", productos=" + productos + "]";
	}
	
	
}
