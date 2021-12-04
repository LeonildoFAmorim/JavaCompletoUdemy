package classes_abstratas.exercicio_fixacao.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes_abstratas.exercicio_fixacao.entidades.Contribuinte;
import classes_abstratas.exercicio_fixacao.entidades.PessoaFisica;
import classes_abstratas.exercicio_fixacao.entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> contribuintes = new ArrayList<>();

		System.out.print("Entre com o numero de contribuintes: ");
		int nc = sc.nextInt();
		for (int i = 1; i <= nc; i++) {
			System.out.println("Dados do contribuinte #" + i);
			System.out.print("pessoa fisica ou jurica? (f / j): ");
			char pessoa = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (pessoa == 'f') {
				System.out.print("Gastos com saude: ");
				double gastosSaude = sc.nextDouble();
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("numero de empregados: ");
				int nEmp = sc.nextInt();
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, nEmp));
			}
		}
		System.out.println();
		double impostoTotal = 0;
		System.out.println("Impostos pagos: ");
		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte.getNome() + " $ " + String.format("%.2f", contribuinte.calculaImposto()));
			impostoTotal += contribuinte.calculaImposto();
		}
		System.out.println();
		System.out.println("Imposto total: " + String.format("%.2f", impostoTotal));
	}
}
