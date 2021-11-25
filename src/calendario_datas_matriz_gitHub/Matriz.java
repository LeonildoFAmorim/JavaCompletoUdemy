package calendario_datas_matriz_gitHub;

import java.util.Scanner;

public class Matriz {
	public static void main(String []args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o tamanho da matriz");
		int n = teclado.nextInt();
		int [][]  mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = teclado.nextInt();
			}
		}
		
		// imprimindo a diagonal principal
		System.out.println("diagonal principal");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i]+" ");
		}
	}

}
