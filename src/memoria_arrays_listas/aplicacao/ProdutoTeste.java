package memoria_arrays_listas.aplicacao;

import java.util.Scanner;

import memoria_arrays_listas.entidades.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o tamanho da lista");
		int tamanho = sc.nextInt();
		Produto []produtos = new Produto[tamanho];
		double soma = 0;
		for (int i = 0; i < tamanho; i++) {
			sc.nextLine();
			System.out.println("digite o nome do " +(i + 1)+ " produto");
			String nome = sc.nextLine();
			System.out.println("digite o preço do " +(i + 1)+ " produto");
			double valor = sc.nextDouble();
			produtos[i] = new Produto(nome,valor);
		    soma += produtos[i].getPreco();
		}
		double media = soma / tamanho;
		System.out.println("media : " + media);
	}

}
