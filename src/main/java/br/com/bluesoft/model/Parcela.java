package br.com.bluesoft.model;

import java.math.BigDecimal;

import org.apache.commons.lang3.Validate;

public class Parcela{
	
	private final  int numeroParcela;
	private final BigDecimal valorParcela;
	private boolean isQuitada;
	
	public Parcela(int numeroParcela, BigDecimal valorParcela) {
		super();
		Validate.isTrue(numeroParcela > 0 , "O Número das parcelas eve ser maior que zero.");
		Validate.notNull(valorParcela, "O valor da parcela é obrigatório");
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
	
	@Override
	public String toString() {
		return String.format("Parcela numero: %d no valor %.2f %s está quitada", this.numeroParcela, this.valorParcela.doubleValue(), (isQuitada) ? "": "NÃO");
	}
	
}
