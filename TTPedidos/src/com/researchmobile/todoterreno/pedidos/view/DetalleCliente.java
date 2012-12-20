package com.researchmobile.todoterreno.pedidos.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.researchmobile.todoterreno.pedidos.entity.Cliente;
import com.researchmobile.todoterreno.pedidos.ws.Peticion;

public class DetalleCliente extends Activity{
	
	private Cliente cliente;
	private String codigoCliente;
	private TextView codigoClienteTextView;
	private TextView empresaTextView;
	private TextView contactoTextView;
	private TextView direccionTextView;
	private TextView telefonoTextView;
	private TextView diasCreditoTextView;
	private TextView limiteTextView;
	private TextView saldoTextView;
	private TextView descuento1TextView;
	private TextView descuento2TextView;
	private TextView descuento3TextView;
	private TextView saldo2TextView;
	private ProgressDialog pd = null;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_cliente);
        
        setCodigoCliente((String)this.getIntent().getSerializableExtra("codigoCliente"));
        
        setCodigoClienteTextView((TextView)findViewById(R.id.detalle_cliente_codigo_textview));
        setEmpresaTextView((TextView)findViewById(R.id.detalle_cliente_empresa_textview));
        setContactoTextView((TextView)findViewById(R.id.detalle_cliente_contacto_textview));
        setDireccionTextView((TextView)findViewById(R.id.detalle_cliente_direccion_textview));
        setTelefonoTextView((TextView)findViewById(R.id.detalle_cliente_telefono_textview));
        setDiasCreditoTextView((TextView)findViewById(R.id.detalle_cliente_dias_credito_textview));
        setLimiteTextView((TextView)findViewById(R.id.detalle_cliente_limite_textview));
        setSaldoTextView((TextView)findViewById(R.id.detalle_cliente_saldo_textview));
        setDescuento1TextView((TextView)findViewById(R.id.detalle_cliente_descuento_textview));
        
        ClienteSeleccionado();
    }
	
	private void ClienteSeleccionado() {
		
	}

	/**
	 * MENU
	 */

	// To change item text dynamically
	public boolean onPrepareOptionsMenu(Menu menu) {
		return true;
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.detalle_cliente_menu, menu);

		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.detalle_cliente_menu_tomar_pedido_opcion:
			TomarPedido();
			return true;
		case R.id.detalle_cliente_menu_motivo_nocompra_opcion:
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	// Clase para ejecutar en Background
	class detalleClienteAsync extends AsyncTask<String, Integer, Integer> {

		// Metodo que prepara lo que usara en background, Prepara el progress
		@Override
		protected void onPreExecute() {
			pd = ProgressDialog.show(DetalleCliente.this, "VERIFICANDO DATOS",
					"ESPERE UN MOMENTO");
			pd.setCancelable(false);
		}

		// Metodo con las instrucciones que se realizan en background
		@Override
		protected Integer doInBackground(String... urlString) {
			try {
				BuscarDetalleCliente();

			} catch (Exception exception) {

			}
			return null;
		}

		private void BuscarDetalleCliente() {
			Peticion peticion = new Peticion();
			setCliente(peticion.DetalleCliente(getCodigoCliente()));
			
		}

		// Metodo con las instrucciones al finalizar lo ejectuado en background
		protected void onPostExecute(Integer resultado) {
			pd.dismiss();
			MostrarDetalleCliente();

		}

		private void MostrarDetalleCliente() {
			getCodigoClienteTextView().setText(getCliente().getCliCodigo());
	        getEmpresaTextView().setText(getCliente().getCliEmpresa());
	        getContactoTextView().setText(getCliente().getCliContacto());
	        getDireccionTextView().setText(getCliente().getCliDireccion());
	        getTelefonoTextView().setText(getCliente().getCliTelefono());
	        getLimiteTextView().setText(getCliente().getCliLimite());
	        getSaldoTextView().setText(getCliente().getCliSaldo());
	        getDescuento1TextView().setText(getCliente().getCliDes1());
			
		}
	}


	private void TomarPedido() {
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TextView getTelefonoTextView() {
		return telefonoTextView;
	}

	public void setTelefonoTextView(TextView telefonoTextView) {
		this.telefonoTextView = telefonoTextView;
	}

	public TextView getDireccionTextView() {
		return direccionTextView;
	}

	public void setDireccionTextView(TextView direccionTextView) {
		this.direccionTextView = direccionTextView;
	}

	public TextView getCodigoClienteTextView() {
		return codigoClienteTextView;
	}

	public void setCodigoClienteTextView(TextView codigoClienteTextView) {
		this.codigoClienteTextView = codigoClienteTextView;
	}

	public TextView getEmpresaTextView() {
		return empresaTextView;
	}

	public void setEmpresaTextView(TextView empresaTextView) {
		this.empresaTextView = empresaTextView;
	}

	public TextView getContactoTextView() {
		return contactoTextView;
	}

	public void setContactoTextView(TextView contactoTextView) {
		this.contactoTextView = contactoTextView;
	}

	public TextView getDiasCreditoTextView() {
		return diasCreditoTextView;
	}

	public void setDiasCreditoTextView(TextView diasCreditoTextView) {
		this.diasCreditoTextView = diasCreditoTextView;
	}

	public TextView getLimiteTextView() {
		return limiteTextView;
	}

	public void setLimiteTextView(TextView limiteTextView) {
		this.limiteTextView = limiteTextView;
	}

	public TextView getSaldoTextView() {
		return saldoTextView;
	}

	public void setSaldoTextView(TextView saldoTextView) {
		this.saldoTextView = saldoTextView;
	}

	public TextView getDescuento1TextView() {
		return descuento1TextView;
	}

	public void setDescuento1TextView(TextView descuento1TextView) {
		this.descuento1TextView = descuento1TextView;
	}

	public TextView getDescuento2TextView() {
		return descuento2TextView;
	}

	public void setDescuento2TextView(TextView descuento2TextView) {
		this.descuento2TextView = descuento2TextView;
	}

	public TextView getDescuento3TextView() {
		return descuento3TextView;
	}

	public void setDescuento3TextView(TextView descuento3TextView) {
		this.descuento3TextView = descuento3TextView;
	}

	public TextView getSaldo2TextView() {
		return saldo2TextView;
	}

	public void setSaldo2TextView(TextView saldo2TextView) {
		this.saldo2TextView = saldo2TextView;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

}
