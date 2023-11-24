package com.distribuida.entities;

public class Factura {

	//Atributos
	private int id_factura;
	private String fecha_factura;
	private double totalneto;
	private float iva;
	private double total;
	private Cliente cliente;
	
	public Factura () {}
	
	public Factura (Cliente cliente) {
	this.cliente = cliente;
	}
	
	//Metodos_Getter and Setter
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public String getFecha_factura() {
		return fecha_factura;
	}
	public void setFecha_factura(String fecha_factura) {
		this.fecha_factura = fecha_factura;
	}
	public double getTotalneto() {
		return totalneto;
	}
	public void setTotalneto(double totalneto) {
		this.totalneto = totalneto;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(double Iva) {
		this.iva = (float) Iva;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Facturas [id_factura=" + id_factura + ", fecha_factura=" + fecha_factura + ", totalneto=" + totalneto
				+ ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}
	
}
