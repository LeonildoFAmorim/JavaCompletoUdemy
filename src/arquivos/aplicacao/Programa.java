package arquivos.aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Leonildo\\eclipse-workspace\\javaCompletoUdemy\\src\\arquivos\\Teste.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally { // como boa pr�tica o fechamento do scanner vem no bloco finally, primeiro verifica se o scanner n�o � null, porque se for d� uma nulpointer exception.
			if (sc != null) {
				sc.close();
			}
		}
	}
}
