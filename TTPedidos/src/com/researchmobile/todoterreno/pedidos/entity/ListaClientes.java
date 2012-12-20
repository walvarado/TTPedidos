package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class ListaClientes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Cliente[] cliente;
	private RespuestaWS respuesta;
	public Cliente[] getCliente() {
		return cliente;
	}
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	public RespuestaWS getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(RespuestaWS respuesta) {
		this.respuesta = respuesta;
	}
	
}
