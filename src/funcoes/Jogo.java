package funcoes;

import entities.Jogadores;
import entities.Tabuleiro;

public class Jogo {
	public static Integer posicao;
	
	public static void jogo() {
		
		funcoesEstaticas.nome();
		funcoesEstaticas.peca();
		Jogadores j1 = new Jogadores(funcoesEstaticas.jogador, funcoesEstaticas.peca);
		funcoesEstaticas.nome();
		funcoesEstaticas.peca();
		Jogadores j2 = new Jogadores(funcoesEstaticas.jogador, funcoesEstaticas.peca);
		
		System.out.println("Informe a posição a ser inserida a peça: ");
		System.out.println("1| 2 |3");
		System.out.println("4| 5 |6");
		System.out.println("7| 8 |9");
		j1.setPosicao(posicao);
		
		Tabuleiro.tabuleiro();
		Tabuleiro.movimento(j1.getNome(), j1.getPeca(),j1.getPosicao());
		
		System.out.println("Informe a posição a ser inserida a peça: ");
		System.out.println("1| 2 |3");
		System.out.println("4| 5 |6");
		System.out.println("7| 8 |9");
		j2.setPosicao(posicao);
		Tabuleiro.tabuleiro();
		Tabuleiro.movimento(j2.getNome(), j2.getPeca(),j2.getPosicao());
		
		
	}

}
