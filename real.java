package Principal;

public class real extends moeda { //Herança classe moeda

	    public real(double valor) {
	        super(valor, "Brasil"); //Construtor que chama da classe moeda
	    }

	    @Override // Sobrescreve o método criado na classe moeda - poliformismo
	    public double converterParaReal() { //Método que converte moeda para real
	        return valor;
	    }

	    @Override // Sobrescreve o método criado na classe moeda - poliformismo
	    public String info() {
	        return "Real: R$" + valor; //Método informações da moeda
	    }
	}

