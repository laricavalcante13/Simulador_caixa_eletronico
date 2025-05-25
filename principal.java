package Principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        cofrinho cofrinho = new cofrinho();

	        while (true) { //Menu do cofrinho
	            System.out.println("\n Bem-vindo ao menu Cofrinho");
	            System.out.println("1. Adicionar Moeda");
	            System.out.println("2. Remover Moeda");
	            System.out.println("3. Listar Moedas");
	            System.out.println("4. Calcular Total em Reais");
	            System.out.println("5. Sair");
	            System.out.print("Escolha uma opção: ");

	            int opcao = scanner.nextInt();
	            
	            switch (opcao) {
	               
	            	case 1: // Opção adicionar moeda
	                    System.out.println("Escolha a moeda: 1. Real 2. Dólar 3. Euro");
	                    int tipoMoeda = scanner.nextInt();
	                   
	                    System.out.print("Informe o valor: ");
	                    double valor = scanner.nextDouble();

	                    switch (tipoMoeda) {
	                        case 1 -> cofrinho.adicionarMoeda(new real(valor));
	                        case 2 -> cofrinho.adicionarMoeda(new dolar(valor));
	                        case 3 -> cofrinho.adicionarMoeda(new euro(valor));
	                        default -> System.out.println("Tipo inválido") ;
	                    }
	                    break;
	               
	                case 2: // Opção listar moedas
	                    cofrinho.listarMoedas();
	                    System.out.print("Informe o índice da moeda a remover: ");
	                    int indice = scanner.nextInt();
	                    cofrinho.removerMoeda(indice);
	                    break;
	               
	                case 3:  // Opção listar moedas cadastradas
	                    cofrinho.listarMoedas();
	                    break;
	                
	                case 4:  // Opção calcular total das moedas em real
	                    cofrinho.calcularTotalEmReais();
	                    break;
	                
	                case 5:  // Opção fechar o sistema
	                    System.out.println("Fechando o cofrinho");
	                    scanner.close();
	                    return;
	                
	                default:  // Opção padrão
	                    System.out.println("Opção  inválida");
	            }
	        }
	    }
	
	}


