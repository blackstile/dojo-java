package br.com.bluesoft.service.parcela;

import java.util.Set;

import br.com.bluesoft.model.Conta;
import br.com.bluesoft.model.Parcela;

public interface Parcelador {
	
	Set<Parcela> parcelar(Conta conta);

}
