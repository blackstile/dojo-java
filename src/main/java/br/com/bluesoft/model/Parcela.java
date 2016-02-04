package br.com.bluesoft.model;

import java.math.BigDecimal;

public class Parcela{
	
	private final  int numeroParcela;
	private final BigDecimal valorParcela;
	private boolean isQuitada;
	
	public Parcela(int numeroParcela, BigDecimal valorParcela) {
		super();
		this.numeroParcela = numeroParcela;
		this.valorParcela = valorParcela;
	}
	public int getNumeroParcela() {
		return numeroParcela;
	}
	public BigDecimal getValorParcela() {
		return valorParcela;
	}
	
	public boolean isQuitada() {
		return isQuitada;
	}
	
	public void pagar(){
		this.isQuitada =  true;
	}
	
}
