package br.com.bluesoft.service.impressora;

import br.com.bluesoft.model.Conta;

public class ConsoleImpressora implements ImpressoraService {

	@Override
	public void print(Conta conta) {
		System.out.println(conta);
		
	}

}
