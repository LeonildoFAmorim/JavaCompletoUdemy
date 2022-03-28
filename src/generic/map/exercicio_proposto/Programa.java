package generic.map.exercicio_proposto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votos = new LinkedHashMap<>();

		System.out.println("Digite o caminho:");
		String caminho = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				int qtdVotos = Integer.parseInt(campos[1]);
				if (votos.containsKey(nome)) {
					int votosAteAgora = votos.get(nome);
					votos.put(nome, qtdVotos + votosAteAgora);
				} else {
					votos.put(nome, qtdVotos);
				}
				linha = br.readLine();
			}
			for (String chave : votos.keySet()) {
				System.out.println(chave + ": " + votos.get(chave));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
