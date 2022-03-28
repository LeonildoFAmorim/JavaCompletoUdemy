package generic.set.exercicio_resolvido.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import generic.set.exercicio_resolvido.entidades.LogEntrada;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<LogEntrada> entradas = new HashSet<>();
		// a estrutra Set não aceita valores repetidos.
		// o valor de comparação aqui está sendo o nome.

		System.out.println("Digite o caminho: ");
		String caminho = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(" ");
				String nome = campos[0];
				Date data = Date.from(Instant.parse(campos[1]));
				entradas.add(new LogEntrada(nome, data));
				linha = br.readLine();
			}
			System.out.println("Quantidade de usuarios: " + entradas.size());
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		for (LogEntrada entrada : entradas) {
			System.out.println(entrada);
		}
		sc.close();
	}
}
