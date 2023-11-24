package com.distribuida.entities;

public class DetalleFactura {

	//Atributos
	private int id_detallefactura;
	private int cantidad;
	private double subtotal;
	private Producto producto;
	private Factura factura;
	
	public DetalleFactura () {}
	
	
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


	public Producto getProductos() {
		return producto;
	}


	public void setProductos(Producto producto) {
		this.producto = producto;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	@Override
	public String toString() {
		return "DetalleFactura [id_detallefactura=" + id_detallefactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", producto=" + producto + ", factura=" + factura + "]";
	}

}
