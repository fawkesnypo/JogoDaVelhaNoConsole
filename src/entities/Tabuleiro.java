package entities;

public class Tabuleiro {
	public static String [][] mat = new String [3][3];
	
	//Imprime imagem de um tabuleiro de Jogo da Velha
	public static void imagemTabuleiro() {
		System.out.println();
		System.out.println("   Jogo |     |     ");
		System.out.println("   _____|_____|_____");
		System.out.println("        |  D  |     ");
		System.out.println("   _____|__A__|_____");
		System.out.println("        |     |     ");
		System.out.println("        |     |Velha\n");
		
	}
	
	//Imprime tabuleiro na tela
	public static void tabuleiro() {
		System.out.println("\n"+mat[0][0]+" | "+mat[1][0]+" | "+mat[2][0]);
		System.out.println("__ __  __");
		System.out.println(mat[0][1]+" | "+mat[1][1]+" | "+mat[2][1]);
		System.out.println("__ __  __");
		System.out.println(mat[0][2]+" | "+mat[1][2]+" | "+mat[2][2]+"\n");
		
	}
	
	//Define o local onde será inserido a peça
	public static void movimento(String nome, String peca, int posicao) {
		
		switch (posicao) {
		case 1:
			mat [0][0] = peca;
			break;
			
		case 2:
			mat [1][0] = peca;
			break;
			
		case 3:
			mat [2][0] = peca;
			break;
			
		case 4:
			mat [0][1] = peca;
			break;
			
		case 5:
			mat [1][1] = peca;
			break;
			
		case 6:
			mat [2][1] = peca;
			break;
			
		case 7:
			mat [0][2] = peca;
			break;
			
		case 8:
			mat [1][2] = peca;
			break;
			
		case 9:
			mat [2][2] = peca;
			break;
			
		default:
			break;
		}
		
	}
}
