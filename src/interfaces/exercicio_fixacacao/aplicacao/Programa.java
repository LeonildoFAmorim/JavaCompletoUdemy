package interfaces.exercicio_fixacacao.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import interfaces.exercicio_fixacacao.modelo.entidades.Contrato;
import interfaces.exercicio_fixacacao.modelo.entidades.Parcela;
import interfaces.exercicio_fixacacao.modelo.servicos.ServicoContrato;
import interfaces.exercicio_fixacacao.modelo.servicos.ServicoPayPal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero do contrato: ");
		int numeroContrato = scanner.nextInt();
		System.out.print("Data: (dd/mm/aaaa): ");
		Date data = sdf.parse(scanner.next());
		System.out.print("Valor do contrato: ");
		double valorContrato = scanner.nextDouble();
		
		Contrato contrato = new Contrato(numeroContrato, data, valorContrato);
		
		System.out.print("Quantidade de parcelas");
		int qtdParcelas = scanner.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());// aqui foi injetado a dependência
		servicoContrato.processarContrato(contrato, qtdParcelas);
		
		System.out.println();
		System.out.println("Parcelas");
		for (Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		scanner.close();	
	}
}
