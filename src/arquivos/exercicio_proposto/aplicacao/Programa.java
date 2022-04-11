package arquivos.exercicio_proposto.aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import arquivos.exercicio_proposto.entidades.Item;

public class Programa {
	
	// nessa clasee será criado um arquivo no caminho digitado pelo o usuário.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho: ");
		String caminho = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			List<Item> lista = new ArrayList<>();
			String linhaLida = br.readLine();
			while (linhaLida != null) {
				String[] campos = linhaLida.split(",");
				lista.add(new Item(campos[0], Double.parseDouble(campos[1]), Integer.parseInt(campos[2])));
				linhaLida = br.readLine();
			}
			System.out.println("Digite o caminho para gravar arquivo: ");
			String caminhoSaida = sc.nextLine();
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoSaida))){
				for (Item item : lista) {
					bw.write(item.getNome()+ "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println("Arquivo criado com sucesso.");
			}catch (Exception e) {
				System.out.println("Erro na escrita: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Erro na leitura: " + e.getMessage());
		}
		sc.close();
	}
}