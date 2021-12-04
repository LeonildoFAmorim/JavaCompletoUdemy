package classes_abstratas.exercicio_resolvido.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes_abstratas.exercicio_resolvido.entidades.Circulo;
import classes_abstratas.exercicio_resolvido.entidades.Cores;
import classes_abstratas.exercicio_resolvido.entidades.Forma;
import classes_abstratas.exercicio_resolvido.entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Forma> formas = new ArrayList<>();

		System.out.print("Entre com a quantidade de formas: ");
		int qtdF = sc.nextInt();
		for (int i = 1; i <= qtdF; i++) {
			System.out.println("Forma #" + i);
			System.out.print("retangulo ou circulo? (r / c): ");
			char forma = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Cor (PRETO, AZUL, VERMELHO): ");
			Cores cor = Cores.valueOf(sc.next());
			if (forma == 'r') {
				System.out.print("largura: ");
				double largura = sc.nextDouble();
				System.out.print("altura: ");
				double altura = sc.nextDouble();
				formas.add(new Retangulo(cor, largura, altura));
			} else {
				System.out.print("raio: ");
				double raio = sc.nextDouble();
				formas.add(new Circulo(cor, raio));
			}

		}
		System.out.println();
		System.out.println("Formas: ");
		for (Forma forma : formas) {
			System.out.println(String.format("%.2f", forma.area()));
		}

	}

}
