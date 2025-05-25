package Principal;

public class dolar extends moeda { //Herança classe moeda

	    public dolar(double valor) {
	        super(valor, "EUA"); //Construtor que chama da classe moeda
	    }

	    @Override // Sobrescreve o método criado na classe moeda - poliformismo
	    public double converterParaReal() { //Método que converte moeda para real
	        return valor * 5.7660; // Cotação ptax venda 28/03/2025 - Fonte BCB
	    }

	    @Override // Sobrescreve o método criado na classe moeda - poliformismo
	    public String info() {
	        return "Dólar: $" + valor; //Método informações da moeda
	    }
	}

