package entities;

public class Jogadores {
	private String nome,peca;
	private Integer posicao;

	public Jogadores(String nome, String peca) {
		super();
		this.nome = nome;
		this.peca = peca;
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
