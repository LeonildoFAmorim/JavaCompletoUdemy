package interfaces.problema_exemplo.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import interfaces.problema_exemplo.modelo.entidades.AluguelCarro;
import interfaces.problema_exemplo.modelo.entidades.Veiculo;
import interfaces.problema_exemplo.modelo.servicos.ServicoDeAluguel;
import interfaces.problema_exemplo.modelo.servicos.ServicoImpostoBrasil;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do alguel: ");
		System.out.print("Entre com o  medelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Entre com a data de saida: (dd/mm/aaaa hh:mm): ");
		Date dataInicioAluguel = sdf.parse(sc.nextLine());
		System.out.print("Entre com a data de retorno: (dd/mm/aaaa hh:mm): ");
		Date dataFimAluguel = sdf.parse(sc.nextLine());
		AluguelCarro aluguelCarro = new AluguelCarro(dataInicioAluguel, dataFimAluguel, new Veiculo(modelo));
		
		System.out.print("Preco por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Preco por dia: ");
		double precoDia = sc.nextDouble();
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoHora, precoDia, new ServicoImpostoBrasil());
		servicoDeAluguel.processarNotaPagamento(aluguelCarro);
		
		System.out.println();
		System.out.println("Nota de pagamento:");
		System.out.println("Pagamento base: " + String.format("%.2f", aluguelCarro.getNotaPagamento().getPagamentoBase()));
		System.out.println("Imposto: " + String.format("%.2f" , aluguelCarro.getNotaPagamento().getImposto()));
		System.out.println("Pagmento total: " + String.format("%.2f", aluguelCarro.getNotaPagamento().getPagamentoTotal()));
		sc.close();
	}
}
