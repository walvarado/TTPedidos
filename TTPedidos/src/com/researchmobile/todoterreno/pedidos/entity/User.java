package com.researchmobile.todoterreno.pedidos.entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static String username;
	private static String clave;
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		User.username = username;
	}
	public static String getClave() {
		return clave;
	}
	public static void setClave(String clave) {
		User.clave = clave;
	}
	
	

}
