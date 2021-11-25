package memoria_arrays_listas.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import memoria_arrays_listas.entidades.Quartos;

public class QuartoTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Quartos [] quartos = new Quartos[10];
		System.out.println("quantos quartos para alugar?");
		int quantiaQuartos = sc.nextInt();
		for (int i = 0; i < quantiaQuartos; i++) {
			sc.nextLine();
			System.out.println("digite o nome:");
			String nome = sc.nextLine();
			System.out.println("digite o email do(a) " + nome);
			String email = sc.nextLine();
			System.out.println("digite o número do quarto");
			int numeroQuarto = sc.nextInt();
			quartos[numeroQuarto] = new Quartos(nome,email,numeroQuarto);
		}
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.print(quartos[i].getNome()+" ");
				System.out.print(quartos[i].getEmail()+" ");
				System.out.print(quartos[i].getQuarto()+" ");
				System.out.println();
			}
		}
		sc.close();
	}
}
