package expressoes_lambda.exercicio_resolvido_stream.aplicacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import expressoes_lambda.exercicio_resolvido_stream.entidades.Produto;
import expressoes_lambda.problemas_exemplos.entidades.Product;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho:");
		String caminho = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			List<Produto> lista = new ArrayList<>();
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			double precoMedio = lista.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (x , y) -> x + y) / lista.size();
			
			System.out.println("Media: " + String.format("%.2f", precoMedio));
			
			// resolvendo a exibição dos nomes dos produtos nomes em ordem decrescente
			Comparator<String> comparator = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());
			List<String> nomes = lista.stream()
					.filter(p -> p.getPreco() < precoMedio)
					.map(p -> p.getNome())
					.sorted(comparator.reversed())// por padrão o sorted é de ordem alfabética, foi revertido pelo reversed
					.collect(Collectors.toList());
			
			nomes.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
