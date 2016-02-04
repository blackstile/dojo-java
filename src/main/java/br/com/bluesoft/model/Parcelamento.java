package br.com.bluesoft.model;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang3.Validate;

public class Parcelamento {
	
	private final List<BigDecimal> valores;

	public Parcelamento(List<BigDecimal> valores) {
		Validate.notNull(valores);
		Validate.notEmpty(valores);
		this.valores = valores;
	}

	public List<BigDecimal> getValores() {
		return valores;
	}

}
