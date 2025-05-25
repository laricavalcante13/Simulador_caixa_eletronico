package Principal;

import java.util.ArrayList;

public class cofrinho {//Classe de cálculo do cofrinho

	public ArrayList<moeda> moedas = new ArrayList<>(); //Array para armazenar moeadas

    public void adicionarMoeda(moeda moeda) { //Método para adicionar moedas
        moedas.add(moeda);
    }

    public void removerMoeda(int indice) { //Método para remover moedas
        if (indice >= 0 && indice < moedas.size()) { 
            moedas.remove(indice);
        } 
        else {
            System.out.println("Índice inválido"); //Opção para caso não haja moedas no array
        }
    }

    public void listarMoedas() { //Método para listar moedas
        if (moedas.isEmpty()) { 
            System.out.println("Cofrinho vazio."); //Opção para caso não haja moedas no array
        }
        else {
            for (int i = 0; i < moedas.size(); i++) { //Mostra todas as moedas do array
                System.out.println(i + ". " + moedas.get(i).info());
            }
        }
    }

    public void calcularTotalEmReais() { //Método que calcula o total do array e converte para real
        double total = 0;
        
        for (moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        System.out.printf("Total em reais: R$ %.2f\n", total);
    }
}


