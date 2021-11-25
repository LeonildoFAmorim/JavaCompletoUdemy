package calendario_datas_matriz_gitHub;

import java.util.Scanner;

public class Matriz_01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite a quantidade de linhas");
		int l = teclado.nextInt();
		System.out.println("digite a quantidade de colunas");
		int c = teclado.nextInt();
		
		int [][] mat = new int[l][c];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("digite o número para busca");
		int busca = teclado.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == busca) {
					System.out.println("posição: " + i + ", "+ j);
					if(j > 0) {
						System.out.println("esquerda: " + mat[i][j - 1]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("direita: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("em cima: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("em baixo: " + mat[i + 1][j]);
					}
				}
			}
		}	
	}
}
