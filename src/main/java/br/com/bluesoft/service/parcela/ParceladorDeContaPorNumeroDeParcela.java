package br.com.bluesoft.service.parcela;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import br.com.bluesoft.model.Conta;
import br.com.bluesoft.model.Parcela;
import br.com.bluesoft.model.Parcelamento;
import br.com.bluesoft.service.impressora.ConsoleImpressora;
import br.com.bluesoft.service.impressora.ImpressoraService;

public class ParceladorDeContaPorNumeroDeParcela implements Parcelador {

	private ImpressoraService impressora =  new ConsoleImpressora();
	private final int numeroDeParcelas;
	public ParceladorDeContaPorNumeroDeParcela(int numeroParcelas){
		this.numeroDeParcelas =  numeroParcelas;
	}
	
	@Override
	public Set<Parcela> parcelar(Conta conta) {
		BigDecimal valorDasParcelas = BigDecimal.valueOf(conta.getValor().doubleValue() / this.numeroDeParcelas);
		List<BigDecimal> valores = new ArrayList<BigDecimal>();
		for (int i = 1; i <= this.numeroDeParcelas; i++) {
			valores.add(valorDasParcelas);			
		}
		Set<Parcela> parcelas = conta.parcelar(new Parcelamento(valores));
		parcelas.stream()
			.sorted(Comparator.comparing(Parcela::getNumeroParcela))
			.forEach(parcela-> impressora.imprimir(parcela.toString()));
		return parcelas;
		
	}
	
	

}
