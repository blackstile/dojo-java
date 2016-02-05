package br.com.bluesoft.service.impressora;


public class ConsoleImpressora implements ImpressoraService {

	@Override
	public void imprimir(String dados) {
		System.out.println(dados);

	}

}
