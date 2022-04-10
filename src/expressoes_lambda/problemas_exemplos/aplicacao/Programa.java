package expressoes_lambda.problemas_exemplos.aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import expressoes_lambda.problemas_exemplos.entidades.Product;

public class Programa {

	public static void main(String[] args) {

		// comentar os outros trechos para executar apenas um trecho

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// remover os produtos cujo o valor é maior que 100.
		/*
		 * double minimo = 100.00; list.removeIf(p -> p.getPrice() >= minimo); for
		 * (Product p : list) { System.out.println(p); }
		 */

		// aumentar 10% no valor de todos os produtos.
		/*
		 * double porcentagemAumento = 1.1; list.forEach(p -> p.setPrice(p.getPrice() *
		 * porcentagemAumento)); list.forEach(System.out::println);
		 */

		// escrever todos em caixa alta (letra maiúscula)
		// primeiro a lista é convertida para stream, letra maiúscula é aplicada, depois
		// o stream é convertida para list
		/*
		 * List<String> nomes = list.stream().map(p ->
		 * p.getName().toUpperCase()).collect(Collectors.toList());
		 * nomes.forEach(System.out::println);
		 */

		// calcule a soma dos preços somente dos produtos cujo nome começa com "T".

		/*
		 * ServicoDeProduto servicoDeProduto = new ServicoDeProduto(); double soma =
		 * servicoDeProduto.somaPorFiltro(list, p -> p.getName().charAt(0) == 'T');
		 * double soma1 = servicoDeProduto.somaPorFiltro(list, p -> p.getPrice() <=
		 * 100);// alterando a condição System.out.println("soma: " +
		 * String.format("%.2f", soma)); System.out.println("soma: " +
		 * String.format("%.2f", soma1));
		 */

		// stream
		List<Integer> numeros = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = numeros.stream().map(x -> x * 10);// o map aplica a função a cada elemento da stream ou
																// lista
		System.out.println(Arrays.toString(st1.toArray()));
		Stream<String> nomes = Stream.of("Maria", "Alex", "Bob");// o Stream.of permite colocar diretamente os elementos
																	// na stream
		System.out.println(Arrays.toString(nomes.toArray()));

		Stream<Integer> st2 = Stream.iterate(0, x -> x + 1);// imprimir de 0 a 40
		System.out.println(Arrays.toString(st2.limit(40).toArray()));
		
		
	}
}
