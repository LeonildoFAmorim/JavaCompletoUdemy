package heranca_polimorfismo.exercicio_resolvido.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.exercicio_resolvido.entidades.Funcionario;
import heranca_polimorfismo.exercicio_resolvido.entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("Entre com a quantidade de funcionarios: ");
		int qtdF = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= qtdF; i++) {
			System.out.println("Dados do funcionario # " + i);
			System.out.print("Tecerizado: (s / n): ");
			char resposta = sc.next().charAt(0);
			sc.nextLine();
			if (resposta == 'n') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas trabalhadas: ");
				int horasTrabalhadas = sc.nextInt();
				sc.nextLine();
				System.out.print("Valor por hora: ");
				double valorHora = sc.nextDouble();
				funcionarios.add(new Funcionario(nome, horasTrabalhadas, valorHora));
			} else {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas trabalhadas: ");
				int horasTrabalhadas = sc.nextInt();
				sc.nextLine();
				System.out.print("Valor por hora: ");
				double valorHora = sc.nextDouble();
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				funcionarios.add(new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesaAdicional));
			}
		}
		System.out.println();
		System.out.println("Lista de funicionarios: ");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome() + " $ " + String.format("%.2f", funcionario.pagamento()));
		}

		sc.close();
	}

}
