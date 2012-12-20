package com.researchmobile.todoterreno.pedidos.utility;

import java.text.DecimalFormat;

public class FormatDecimal {
	
	public String ConvierteFloat(float numero){
		
		DecimalFormat formateador = new DecimalFormat("#0.00");
		String resultado = formateador.format(numero);
		return resultado;
	}
}
