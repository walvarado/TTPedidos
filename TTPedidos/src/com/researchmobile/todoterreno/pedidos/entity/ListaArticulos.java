package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class ListaArticulos implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Articulo[] articulo;
	private RespuestaWS respuesta;
	public Articulo[] getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo[] articulo) {
		this.articulo = articulo;
	}
	public RespuestaWS getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(RespuestaWS respuesta) {
		this.respuesta = respuesta;
	}
	
}
