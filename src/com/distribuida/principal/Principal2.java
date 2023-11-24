package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.Producto;
import com.distribuida.entities.Factura;
import com.distribuida.entities.DetalleFactura;
public class Principal2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Cliente cliente = context.getBean("idCliente",Cliente.class);
		
		Producto producto = context.getBean("idProducto",Producto.class);

		Factura factura = context.getBean("idFactura",Factura.class);
		
		DetalleFactura detallefactura = context.getBean("idDetalleFactura",DetalleFactura.class);
		
		DatosEmpresa datosEmpresa = context.getBean("idDatosEmpresa",DatosEmpresa.class);
		
		//Cliente
	    cliente.setId_cliente(1);
	    cliente.setCedula(1755462650);
	    cliente.setNombre_cliente("Darwin Sosa");
	    cliente.setFecha("09-07-2002");
	    cliente.setTelefono(990562860);
	    cliente.setCorreo("sosadarwin2002@gmail.com");
	    
	    //Producto
	    producto.setId_producto(1);
	    producto.setNombre_producto("manzanas");
	    producto.setDescripcion("caja de manzanas");
	    producto.setPrecio(850.99);
	    producto.setStock(5);
	    
	    //Factura
	    factura.setId_factura(1);
	    factura.setCliente(cliente); 
	    factura.setFecha_factura("14/11/2023");
	    factura.setTotalneto(53.28);
	    factura.setIva(0.12);
	    factura.setTotal(63.20);
	    
	    //Detalle Factura
	    detallefactura.setId_detallefactura(1);
	    detallefactura.setCantidad(1);
        detallefactura.setSubtotal(53.26);
	    
	    System.out.println(factura.toString());
	    System.out.println(detallefactura.toString());
	    System.out.println(datosEmpresa.toString());

	    context.close();
	    
  }
}