package Principal;

public class euro extends moeda{ //Herança classe moeda

	    public euro(double valor) {
	        super(valor, "UE"); //Construtor que chama da classe moeda
	    }

	    @Override // Sobrescreve o método criado na classe moeda - poliformismo
	    public double converterParaReal() { //Método que converte moeda para real
	        return valor * 6.2423; // Cotação ptax venda 28/03/2025 - Fonte BCB
	    }

	    @Override // Sobrescreve o método criado na classe moeda - poliformismo
	    public String info() {
	        return "Euro: €" + valor; //Método informações da moeda
	    }
	}

	

