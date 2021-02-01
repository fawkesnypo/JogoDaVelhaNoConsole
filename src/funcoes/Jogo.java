package funcoes;

import java.util.Scanner;

import entities.Jogadores;
import entities.Tabuleiro;

public class Jogo {
	static Scanner sc = new Scanner(System.in);
	static Jogadores j1 = new Jogadores();
	static Jogadores j2 = new Jogadores();
	
	//Comandos necessários para rodar o jogo
	public static void jogo() {
		
		//Preencher o tabuleiro com n
		funcoesEstaticas.preencherTabuleiro();
		
		//Define o nome do jogador
		funcoesEstaticas.nome();
		j1.nome = funcoesEstaticas.jogador;
		
		//Define a peça do jogador
		funcoesEstaticas.peca();
		j1.peca = funcoesEstaticas.peca.toUpperCase();
		funcoesEstaticas.validaPeca(j1.peca);
		j1.peca = funcoesEstaticas.peca;
		
		j1 = new Jogadores(j1.nome, j1.peca);
		
		//Define o nome do jogador
		funcoesEstaticas.nome();
		j2.nome = funcoesEstaticas.jogador;
		
		j2 = new Jogadores(j2.nome);
		
		//If else criado para definir que se uma peça for selecionada o jogador 2 receberá a outra
		if (j1.peca.contains("X")) {
			j2.peca="O";
		}
		
		else {
			j2.peca="X";
		}
		
		//Imprime instrução sobre jogo na tela
		System.out.println("\n1| 2 |3");
		System.out.println("4| 5 |6");
		System.out.println("7| 8 |9\n");
		System.out.println("O jogo é baseado em posições, conforme a imagem acima.");
		System.out.println("Para colocar a peça (X ou O) basta informar o número da posição.");
		
		Integer x=0;
		do {
			
			if (x==0) {
				System.out.printf("\n"+j1.nome.toUpperCase()+", informe a posição a ser inserida a peça: ");
				j1.posicao= sc.nextInt();
				sc.nextLine();
			
				//função para validar posição da peça
				funcoesEstaticas.validaPosicao(j1.posicao);
				j1.posicao = funcoesEstaticas.position;
				
				//Função que adiciona a peça no local indicado
				Tabuleiro.movimento(j1.nome, j1.peca,j1.posicao);
				
				//Imprime o tabuleiro, com a peça no local adicionado
				Tabuleiro.tabuleiro();
				
				//Verifica se os campos foram preenchido para verificação do ganhador
				Regras.verificaPreenchimento(j1.peca, j1.nome);
				x=Regras.finaliza;
			}
		
			if (x==0) {
				System.out.printf("\n"+j2.nome.toUpperCase()+", informe a posição a ser inserida a peça: ");
				j2.posicao= sc.nextInt();
				
				//função para validar posição da peça
				funcoesEstaticas.validaPosicao(j2.posicao);
				
				j2.posicao = funcoesEstaticas.position;
				
				//Função que adiciona a peça no local indicado
				Tabuleiro.movimento(j2.nome, j2.peca,j2.posicao);
				
				//Imprime o tabuleiro, com a peça no local adicionado
				Tabuleiro.tabuleiro();
				
				//Verifica se os campos foram preenchido para verificação do ganhador
				Regras.verificaPreenchimento(j2.peca, j2.nome);
				x=Regras.finaliza;	
			}
			
		
		} while (x!=1);
		
	}

}
