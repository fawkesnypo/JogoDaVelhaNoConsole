package entities;

public class Tabuleiro {
	
	public static void tabuleiro() {
		System.out.println("        |     |     ");
		System.out.println("   _____|_____|_____");
		System.out.println("        |     |     ");
		System.out.println("   _____|_____|_____");
		System.out.println("        |     |     ");
		System.out.println("        |     |     \n");
		
	}
	
	public static void movimento(String nome, String peca, int posicao) {
		String [][] mat = new String [3][3];
		
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
