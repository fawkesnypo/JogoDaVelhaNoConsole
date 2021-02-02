package entities;

public class Jogadores {
	public String nome, peca;
	public Integer posicao, placar = 0;

	public Jogadores(String nome, String peca) {
		this.nome = nome;
		this.peca = peca;
	}

	public Jogadores(String nome) {
		this.nome = nome;

	}

	public Jogadores() {

	}

	public String getNome() {
		return nome;
	}

	public String getPeca() {
		return peca;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

}
