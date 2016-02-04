package br.com.bluesoft.service.parcela;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.com.bluesoft.model.Conta;
import br.com.bluesoft.model.Parcela;
import br.com.bluesoft.model.Parcelamento;

public class ParceladorDeContaPorNumeroDeParcela implements Parcelador {

	private final int numeroDeParcelas;
	public ParceladorDeContaPorNumeroDeParcela(int numeroParcelas){
		this.numeroDeParcelas =  numeroParcelas;
	}
	
	@Override
	public Set<Parcela> parcelar(Conta conta) {
		BigDecimal valorDasParcelas = conta.getValor().divide(BigDecimal.valueOf(this.numeroDeParcelas));
		List<BigDecimal> valores = new ArrayList<BigDecimal>();
		for (int i = 0; i < this.numeroDeParcelas; i++) {
			valores.add(valorDasParcelas);			
		}
		return conta.parcelar(new Parcelamento(valores));
	}
	
	

}
