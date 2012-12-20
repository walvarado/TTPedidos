package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class LoginEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private Vendedor vendedor;
	private Portafolio[] portafolio;
	private Ruta[] ruta;
	private RespuestaWS respuesta;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Portafolio[] getPortafolio() {
		return portafolio;
	}
	public void setPortafolio(Portafolio[] portafolio) {
		this.portafolio = portafolio;
	}
	public Ruta[] getRuta() {
		return ruta;
	}
	public void setRuta(Ruta[] ruta) {
		this.ruta = ruta;
	}
	public RespuestaWS getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(RespuestaWS respuesta) {
		this.respuesta = respuesta;
	}
	
}
