package funcoes;

import java.util.Scanner;

import entities.Tabuleiro;

public class Menu {
	public static Integer opcao;
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		
		opcao=0;
		
		do {
			//Imprime na tela o desenho de um tabuleiro de Jogo da Velha
			Tabuleiro.imagemTabuleiro();
			
			System.out.println("   ++++++++++++++++++");
			System.out.println("   +                +");
			System.out.println("   +   1 - Jogar    +");
			System.out.println("   +   0 - Sair     +");
			System.out.println("   +                +");
			System.out.println("   ++++++++++++++++++");
			
			funcoesEstaticas.selecaoMenu();
			opcao = funcoesEstaticas.selecao;
			
			switch (opcao) {
			case 1:
				Jogo.jogo();
				
				break;

			default:
				break;
			}
			
		} while (opcao!=0);

	}

}
