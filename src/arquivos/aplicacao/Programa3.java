package arquivos.aplicacao;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		//lendo os nomes das pastas de um caminho 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho:");
		String caminho = sc.nextLine();
		
		File file = new File(caminho);
		
		File pastas [] = file.listFiles(File::isDirectory);
		System.out.println("pastas: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		System.out.println("Arquivos:");
		File arquivos [] = file.listFiles(File::isFile);
		for (File arquivo : arquivos) {
			System.out.println(arquivo);// escrevendo o caminho e o nome do arquivo
			System.out.println(arquivo.getName()); // escrevendo apenas o nome do arquivo
			System.out.println(arquivo.getParent());// escrevendo apenas o caminho do arquivo
		}
		// criando uma nova pasta dentro do caminho que foi passado.
		boolean status = new File(caminho + "\\pasta outra").mkdir();
		System.out.println(status);
		sc.close();
	}
}
