package com.researchmobile.todoterreno.pedidos.ws;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;

import com.researchmobile.todoterreno.pedidos.entity.Cliente;
import com.researchmobile.todoterreno.pedidos.entity.ListaArticulos;
import com.researchmobile.todoterreno.pedidos.entity.ListaClientes;
import com.researchmobile.todoterreno.pedidos.entity.LoginEntity;
import com.researchmobile.todoterreno.pedidos.entity.RespuestaWS;
import com.researchmobile.todoterreno.pedidos.entity.User;

public class Peticion {
	//Temp
	private RequestWSTemp requestWS = new RequestWSTemp();
	private RequestDBTemp requestDB = new RequestDBTemp();
	
	//private RequestWS requestWS = new RequestWS();
	//private RequestDB requestDB = new RequestDB();
	private RespuestaWS respuesta = new RespuestaWS();

	public RespuestaWS login(Context context) {
		try{
			respuesta = requestDB.verificaLoginDB();
			if(respuesta.isResultado()){
				return respuesta;
			}else{
				LoginEntity loginEntity = new LoginEntity();
				loginEntity = requestWS.login(User.getUsername(), User.getClave());
				respuesta = loginEntity.getRespuesta();
				if (respuesta.isResultado()){
					guardarDatos(context, loginEntity);
					cargarClientes(context, loginEntity);
					cargarArticulos(context, loginEntity);
					return respuesta;
				}else{
					return respuesta;
				}
			}
		}catch(Exception exception){
			
		}
		// TODO Auto-generated method stub
		return null;
	}

	private void cargarArticulos(Context context, LoginEntity loginEntity) {
		ListaArticulos listaArticulos = new ListaArticulos();
		int tamanoPortafolio = loginEntity.getPortafolio().length;
		for (int i = 0; i < tamanoPortafolio; i++){
			listaArticulos = requestWS.listaArticulos(loginEntity.getPortafolio()[i].getIdPortafolio());
			if (listaArticulos.getArticulo().length > 0){
				guardarArticulos(context, listaArticulos);
			}
		}
		
	}

	private void guardarArticulos(Context context, ListaArticulos listaArticulos) {
		requestDB.guardarArticulos(context, listaArticulos);
		
	}

	private void cargarClientes(Context context, LoginEntity loginEntity) {
		ListaClientes listaClientes = new ListaClientes();
		int tamanoRuta = loginEntity.getRuta().length;
		for (int i = 0; i < tamanoRuta; i++){
			listaClientes = requestWS.listaClientes(loginEntity.getRuta()[i].getId());
			if (listaClientes.getCliente().length > 0){
				guardarClientes(context, listaClientes);
			}
		}
	}

	private void guardarClientes(Context context, ListaClientes listaClientes) {
		requestDB.guardarClientes(context, listaClientes);
	}

	private void guardarDatos(Context context, LoginEntity loginEntity) {
		requestDB.guardarUsuario(context, loginEntity.getUsuario());
		requestDB.guardarVendedor(context, loginEntity.getVendedor());
		requestDB.guardarPortafolios(context, loginEntity.getPortafolio());
		requestDB.guardarRuta(context, loginEntity.getRuta());
	}

	private void cargarDatosWS(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<HashMap<String, String>> ListaClientesPendientes (){
		ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();
		int visitado = 0;
		Cliente[] cliente = requestDB.listaClientesPendientes();
		int tamano = cliente.length;
		for (int i = 0; i < tamano; i++){
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("codigoCliente", cliente[i].getCliCodigo());
	        map.put("empresa", cliente[i].getCliEmpresa());
	        map.put("contacto", cliente[i].getCliContacto());
	        map.put("direccion", cliente[i].getCliDireccion());
	        map.put("telefono", cliente[i].getCliTelefono());
	        map.put("nit", cliente[i].getCliNit());
	        mylist.add(map);
		}
		return mylist;
		
	}

	public ArrayList<HashMap<String, String>> ListaClientesVisitados (){
		ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();
		int visitado = 0;
		Cliente[] cliente = requestDB.listaClientesVisitados();
		int tamano = cliente.length;
		for (int i = 0; i < tamano; i++){
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("codigoCliente", cliente[i].getCliCodigo());
	        map.put("empresa", cliente[i].getCliEmpresa());
	        map.put("contacto", cliente[i].getCliContacto());
	        map.put("direccion", cliente[i].getCliDireccion());
	        map.put("telefono", cliente[i].getCliTelefono());
	        map.put("nit", cliente[i].getCliNit());
	        mylist.add(map);
		}
		return mylist;
		
	}

	public Cliente DetalleCliente(String codigoCliente) {
		Cliente cliente = new Cliente();
		cliente = requestDB.detalleCliente(codigoCliente);
		return cliente;
	}

}
