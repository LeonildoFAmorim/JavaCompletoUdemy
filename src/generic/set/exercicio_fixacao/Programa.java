package generic.set.exercicio_fixacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> estudantesA = new HashSet<>();
		Set<Integer> estudantesB = new HashSet<>();
		Set<Integer> estudantesC = new HashSet<>();
		
		System.out.print("Quantos estudantes para o curso A: ");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.print("Digite o codigo: ");
			int codigo = sc.nextInt();
			estudantesA.add(codigo);
		}
		
		System.out.print("Quantos estudantes para o curso B: ");
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			System.out.print("Digite o codigo: ");
			int codigo = sc.nextInt();
			estudantesB.add(codigo);
		}
		
		System.out.print("Quantos estudantes para o curso C: ");
		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			System.out.print("Digite o codigo: ");
			int codigo = sc.nextInt();
			estudantesC.add(codigo);
		}
		
		// a estrutura Set não aceita valores repetidos, isso reovolverá o nosso problema.
		Set<Integer> total = new HashSet<>(estudantesA);
		total.addAll(estudantesB);
		total.addAll(estudantesC);
		
		System.out.print("Total de estudantes: " + total.size());
		System.out.println();
		System.out.println("Codigo dos alunos: ");
		for (Integer codigo : total) {
			System.out.println(codigo);
		}
	}
}
