package funcoes;

import java.util.Scanner;

public class funcoesEstaticas {
	public static String jogador,peca;
	public static Integer selecao;
	public static Scanner sc = new Scanner(System.in);
	
	//Função para selecionar opção através de string
	public static Integer selecaoMenu() {
		
		int x = 0;
		do {
			System.out.printf("\nInforme a opção desejada:");
			String select = sc.nextLine();
			select=select.toLowerCase();
			
			if (select.contains("1")||select.contains("jogar")) {
				selecao=1;
				x=1;
			}
			
			else if (select.contains("0")||select.contains("sair")) {
				selecao=0;
				x=1;
			}
			
			if (x!=1) {
				System.out.println("Opção inválida!\n");
				x=0;
			}
			
		} while (x!=1);
		
		return selecao;
	}
	
	//Função para informar nome e selecionar a peça;
	public static String nome() {
		System.out.println("Jogador Informe o nome e selecione a peça");
		System.out.printf("Nome:");
		jogador = sc.nextLine();
		return jogador;
	}
	
	//Função para selecionar peça;
	public static String peca() {
		System.out.printf("Seleciona a peça (X ou O):");
		peca = sc.nextLine();
		return peca;
	}
}
