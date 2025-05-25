package Principal;

public abstract class moeda { //Classe moeda genérica

	  protected double valor;
	    protected String pais;

	    public moeda(double valor, String pais) { // Construtor
	        this.valor = valor;
	        this.pais = pais;
	    }

	    public abstract double converterParaReal() ; //Método converter moeda para real
	    
	    public abstract String info(); //Método informações da moeda
	}

