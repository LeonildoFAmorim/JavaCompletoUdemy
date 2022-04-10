package expressoes_lambda.exercicio_fixacao.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import expressoes_lambda.exercicio_fixacao.entidades.Funcionario;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho: ");
		String caminho = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			List<Funcionario> lista = new ArrayList<>();
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Funcionario(campos[0], campos[1], Double.parseDouble(campos[2])));
				linha = br.readLine();
			}
			System.out.print("Digite o valor para comparar os salarios: ");
			double valor = sc.nextDouble();
			
			List<String> emails = lista.stream()
					.filter(f -> f.getSalario() > valor)
					.map(f -> f.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("email dos funcionario com salario acima de " + valor);
			emails.forEach(System.out::println);
			
			double soma = lista.stream()
					.filter(f -> f.getNome().charAt(0) == 'M')
					.map(f -> f.getSalario())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Total da soma dos salarios em que o  nome começa com M: " + soma);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
