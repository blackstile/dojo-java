package br.com.bluesoft.model;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.Validate;

public class Conta {
	
	private final long numero;
	private final Valor valor;
	private final ValorMinimo valorMinimo;
	private final Set<Parcela> parcelas =  new HashSet<Parcela>();
	
	public Conta(long numero, Valor valor) {
		this(numero, valor, new ValorMinimo(BigDecimal.TEN.doubleValue()));
	}
	
	public Conta(long numero, Valor valor, ValorMinimo valorMinimo) {
		super();
		Validate.isTrue(numero > 0, "O numero da conta deve ser maior que zero");
		this.numero = numero;
		Validate.notNull(valor, "Você tem que ter um valor inicial");
		this.valor = valor;
		this.valorMinimo =  valorMinimo;
	}
	
	public long getNumero() {
		return numero;
	}
	public BigDecimal getValor() {
		return valor.getValor();
	}
	
	public BigDecimal getValorMinimo() {
		return valorMinimo.getValor();
	}
	
	public Set<Parcela> parcelar(Parcelamento parcelamento){
		parcelas.clear();
		List<BigDecimal> valores = parcelamento.getValores();
		valores.forEach(valor->criarParcela(valor));
		return Collections.unmodifiableSet(parcelas);
	}
	
	private void criarParcela(BigDecimal valor){
		parcelas.add(new Parcela(parcelas.size(), valor));
	}

	public Set<Parcela> getParcelas() {
		return Collections.unmodifiableSet(parcelas);
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", valor=" + valor + "]";
	}

}
