package funcoes;

import entities.Tabuleiro;

public class Regras {
	public static Integer finaliza=0;
	
	//Verifica se todas as posições da matriz foram preenchidas
	public static void verificaPreenchimento(String x, String y) {
		
		if ((Tabuleiro.mat[0][0]!="n")&&(Tabuleiro.mat[0][1]!="n")&&(Tabuleiro.mat[0][2]!="n")) {
			vencedor(x, y);
		}
		
		if ((Tabuleiro.mat[1][0]!="n")&&(Tabuleiro.mat[1][1]!="n")&&(Tabuleiro.mat[1][2]!="n")) {
			vencedor(x, y);
		}
		
		if ((Tabuleiro.mat[2][0]!="n")&&(Tabuleiro.mat[2][1]!="n")&&(Tabuleiro.mat[2][2]!="n")) {
			vencedor(x, y);
		}
		
		if ((Tabuleiro.mat[0][0]!="n")&&(Tabuleiro.mat[1][0]!="n")&&(Tabuleiro.mat[2][0]!="n")) {
			vencedor(x, y);
		}
		
		if ((Tabuleiro.mat[0][1]!="n")&&(Tabuleiro.mat[1][1]!="n")&&(Tabuleiro.mat[2][1]!="n")) {
			vencedor(x, y);
		}
		
		if ((Tabuleiro.mat[0][2]!="n")&&(Tabuleiro.mat[1][2]!="n")&&(Tabuleiro.mat[2][2]!="n")) {
			vencedor(x, y);
		}
		
		if ((Tabuleiro.mat[0][0]!="n")&&(Tabuleiro.mat[1][1]!="n")&&(Tabuleiro.mat[2][2]!="n")) {
			vencedor(x, y);
		}
		
		if ((Tabuleiro.mat[2][0]!="n")&&(Tabuleiro.mat[1][1]!="n")&&(Tabuleiro.mat[0][2]!="n")) {
			vencedor(x, y);
		}
		
		
	
	}
	
	//Verifica se alguém ganhou o jogo
	public static void vencedor(String x, String y) {
		
		if ((Tabuleiro.mat[0][0]==x)&&(Tabuleiro.mat[0][1]==x)&&(Tabuleiro.mat[0][2]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
		
		if ((Tabuleiro.mat[1][0]==x)&&(Tabuleiro.mat[1][1]==x)&&(Tabuleiro.mat[1][2]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
		
		if ((Tabuleiro.mat[2][0]==x)&&(Tabuleiro.mat[2][1]==x)&&(Tabuleiro.mat[2][2]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
		
		if ((Tabuleiro.mat[0][0]==x)&&(Tabuleiro.mat[1][0]==x)&&(Tabuleiro.mat[2][0]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
		
		if ((Tabuleiro.mat[0][1]==x)&&(Tabuleiro.mat[1][1]==x)&&(Tabuleiro.mat[2][1]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
		
		if ((Tabuleiro.mat[0][2]==x)&&(Tabuleiro.mat[1][2]==x)&&(Tabuleiro.mat[2][2]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
		
		if ((Tabuleiro.mat[0][0]==x)&&(Tabuleiro.mat[1][1]==x)&&(Tabuleiro.mat[2][2]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
		
		if ((Tabuleiro.mat[2][0]==x)&&(Tabuleiro.mat[1][1]==x)&&(Tabuleiro.mat[0][2]==x)) {
			System.out.println("O Jogador "+y+ " ganhou!");
			finaliza =1;
		}
	}

}
