package arquivos.aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa2 {

	public static void main(String[] args) {
		String frases[] = new String [] {"escrevendo em arquivos", "mais um aprendizado", "espero que seja bom"};
		String caminho = "C:\\Users\\Leonildo\\eclipse-workspace\\javaCompletoUdemy\\src\\arquivos\\saida.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){// true quando queremos recriar o arquivo, se não por o true o arquivo será sobrescrito
			for (String frase : frases) {
				bw.write(frase);
				bw.newLine();
			}	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}