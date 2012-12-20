package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class NuevoPedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	EncabezadoPedido encabezado;
	DetallePedido[] detallePedido;
	public EncabezadoPedido getEncabezado() {
		return encabezado;
	}
	public void setEncabezado(EncabezadoPedido encabezado) {
		this.encabezado = encabezado;
	}
	public DetallePedido[] getDetallePedido() {
		return detallePedido;
	}
	public void setDetallePedido(DetallePedido[] detallePedido) {
		this.detallePedido = detallePedido;
	}
	

}
