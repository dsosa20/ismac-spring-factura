package com.distribuida.entities;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Clientes cliente = context.getBean("idCliente",Clientes.class);
		Clientes cliente2 = context.getBean("idCliente2",Clientes.class);
		
		Productos producto = context.getBean("idProducto",Productos.class);
		Productos producto2 = context.getBean("idProducto2",Productos.class);
		Productos producto3 = context.getBean("idProducto3",Productos.class);
		
		Facturas factura = context.getBean("idFactura",Facturas.class);
		
		DetalleFactura detallefactura = context.getBean("idDetalleFactura",DetalleFactura.class);
		DetalleFactura detallefactura2 = context.getBean("idDetalleFactura2",DetalleFactura.class);
		DetalleFactura detallefactura3 = context.getBean("idDetalleFactura3",DetalleFactura.class);
		
		//Cliente
	    cliente.setId_cliente(1);
	    cliente.setCedula(1755462650);
	    cliente.setNombre_cliente("Darwin Sosa");    
	    cliente.setFecha("09-07-2002");
	    cliente.setTelefono(990562860);
	    cliente.setCorreo("sosadarwin2002@gmail.com");
	    
	    cliente2.setId_cliente(1);
	    cliente2.setCedula(1755362718);
	    cliente2.setNombre_cliente("Mercedes Quilumba");    
	    cliente2.setFecha("01-12-2003");
	    cliente2.setTelefono(990562860);
	    cliente2.setCorreo("mercedesq2@gmail.com");
	    
	    //Producto
	    producto.setId_producto(1);
	    producto.setNombre_producto("Laptop Dell");
	    producto.setDescripcion(null);
	    producto.setPrecio(850.99);
	    producto.setStock(5);
	    
	    producto2.setId_producto(2);
	    producto2.setNombre_producto("iPhone 12");
	    producto2.setDescripcion(null);
	    producto2.setPrecio(999.99);
	    producto2.setStock(6);
	    
	    producto3.setId_producto(2);
	    producto3.setNombre_producto("Smart TV");
	    producto3.setDescripcion(null);
	    producto3.setPrecio(600.99);
	    producto3.setStock(10);

	    //Factura
	    factura.setId_factura(1);
	    factura.setCliente(cliente); 
	    factura.setFecha_factura("14/11/2023");
	    
	    //Detalle Factura
	    detallefactura.setId_detallefactura(1);
	    detallefactura.setProductos(producto);
	    detallefactura.setCantidad(1);
	    
	    detallefactura2.setId_detallefactura(2);
	    detallefactura2.setProductos(producto2); 
	    detallefactura2.setCantidad(2);
	    
	    detallefactura3.setId_detallefactura(3);
	    detallefactura3.setProductos(producto3); 
	    detallefactura3.setCantidad(2);
  }
}
