package br.com.bluesoft.model;

import java.math.BigDecimal;

import org.apache.commons.lang3.Validate;

public class Valor {
	
	private final BigDecimal valor;
	
	public Valor(double valor) {
		super();
		Validate.isTrue(valor > 0, "O numero da conta deve ser maior que zero");
		this.valor = BigDecimal.valueOf(valor);
	};
	
	public BigDecimal getValor() {
		return valor;
	}
}
