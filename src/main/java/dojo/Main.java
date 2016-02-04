package dojo;

import java.util.Set;

import br.com.bluesoft.model.Conta;
import br.com.bluesoft.model.Parcela;
import br.com.bluesoft.model.Valor;
import br.com.bluesoft.model.ValorMinimo;
import br.com.bluesoft.service.impressora.ConsoleImpressora;
import br.com.bluesoft.service.impressora.ImpressoraService;
import br.com.bluesoft.service.parcela.ParceladorDeContaPorNumeroDeParcela;

public class Main {

    public static void main(String[] args) {
    	final ImpressoraService impressora  =  new ConsoleImpressora();
    	
    	Conta contaDeLuz = new Conta(1231231, new Valor(300));
    	Conta contaDeTelefone = new Conta(2324342, new Valor(980), new ValorMinimo(20));
    	
    	impressora.print(contaDeLuz);
    	impressora.print(contaDeTelefone);
    	Set<Parcela> parcelas = new ParceladorDeContaPorNumeroDeParcela(4).parcelar(contaDeLuz);
    	
    }
}
