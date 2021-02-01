package funcoes;

import java.util.Scanner;

import entities.Tabuleiro;

public class funcoesEstaticas {
	public static String jogador, peca;
	public static Integer selecao,position;
	public static Scanner sc = new Scanner(System.in);

	// Função para selecionar opção através de string
	public static Integer selecaoMenu() {

		int x = 0;
		do {
			System.out.printf("\nInforme a opção desejada:");
			String select = sc.nextLine();
			select = select.toLowerCase();
			System.out.println();

			if (select.contains("1") || select.contains("jogar")) {
				selecao = 1;
				x = 1;
			}

			else if (select.contains("0") || select.contains("sair")) {
				selecao = 0;
				x = 1;
			}

			if (x != 1) {
				System.out.println("Opção inválida!\n");
				x = 0;
			}

		} while (x != 1);

		return selecao;
	}

	// Função para informar nome e selecionar a peça;
	public static String nome() {
		System.out.println("Jogador, informe o seu nome.");
		System.out.printf("Nome:");
		jogador = sc.nextLine();
		return jogador.toUpperCase();
	}

	// Função para selecionar peça;
	public static String peca() {
		System.out.printf("Selecione a peça (X ou O):");
		peca = sc.nextLine();
		System.out.println();
		return peca;
	}

	//Função para validar peça
	public static String validaPeca(String p){
		int i=0;
		int x=0;
		peca = p;
		
		do {
			
			if (peca.contains("X")||peca.contains("O")) {
				x=1;
			}
			
			else {
				System.out.println("Peça inválida!");
				i=1;
			}
			
			if (i==1) {
				System.out.printf("\nInforme uma peça válida: ");
				peca=sc.nextLine().toUpperCase();
				validaPeca(peca);
				System.out.println();
				x=1;
			}
			
			else {
				x=1;
			}
			
		} while (x==0);
		
		return peca;
	}
	
	// Valida que a posição informada é valida
	public static Integer validaPosicao(Integer posicao) {
		int i=0;
		int x=0;
		position = posicao;
		do {

			if (position > 9 || position < 1) {
				System.out.println("Posição inválida!\n");
				x = 0;
				i=10;
			}
			
			if (position <10 || position >0) {

				switch (position) {
				case 1:
					Tabuleiro.mat[0][0] = Tabuleiro.mat[0][0];
					if (Tabuleiro.mat[0][0] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 2:
					Tabuleiro.mat[1][0] = Tabuleiro.mat[1][0];
					if (Tabuleiro.mat[1][0] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 3:
					Tabuleiro.mat[2][0] = Tabuleiro.mat[2][0];
					if (Tabuleiro.mat[2][0] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 4:
					Tabuleiro.mat[0][1] = Tabuleiro.mat[0][1];
					if (Tabuleiro.mat[0][1] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 5:
					Tabuleiro.mat[1][1] = Tabuleiro.mat[1][1];
					if (Tabuleiro.mat[1][1] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 6:
					Tabuleiro.mat[2][1] = Tabuleiro.mat[2][1];
					if (Tabuleiro.mat[2][1] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 7:
					Tabuleiro.mat[0][2] = Tabuleiro.mat[0][2];
					if (Tabuleiro.mat[0][2] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 8:
					Tabuleiro.mat[1][2] = Tabuleiro.mat[1][2];
					if (Tabuleiro.mat[1][2] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}
					break;

				case 9:
					Tabuleiro.mat[2][2] = Tabuleiro.mat[2][2];
					if (Tabuleiro.mat[2][2] != "n") {
						System.out.println("A posição já está ocupada!\n");
						x = 0;
						i=10;
					}

					break;

				default:
					break;
				}
			}
			
			if (i==10) {
				System.out.printf("Digite uma posição válida: ");
				position=sc.nextInt();
				validaPosicao(position);
				System.out.println();
				x=1;
			}
			
			if(i!=10) {
				x=1;
			}


		} while (x==0);
		
		return position;
	}
	
	//Preenche os campos do tabuleiro com N
	public static void preencherTabuleiro() {
		for (int i = 0; i <=2; i++) {
			for (int j = 0; j <=2; j++) {
				Tabuleiro.mat[i][j]="n";
				
			}
		}
	}
}
