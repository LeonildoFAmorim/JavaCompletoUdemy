package enumeracao_composicao.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeracao_composicao.entidades.ContratoHora;
import enumeracao_composicao.entidades.Departamento;
import enumeracao_composicao.entidades.NivelDoTrabalhador;
import enumeracao_composicao.entidades.Trabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("entre com o nome do departamento: ");
		String departamento = teclado.nextLine();
		System.out.println("entre com os dados do trabalhador: ");
		System.out.print("nome: ");
		String nomeTrabalhador = teclado.nextLine();
		System.out.print("nível do trabalhador: ");
		String nivelTrabalhador = teclado.nextLine();
		System.out.print("salário base: ");
		double salarioBase = teclado.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelDoTrabalhador.valueOf(nivelTrabalhador),
				salarioBase, new Departamento(departamento));

		System.out.print("quantos contratos para esse trabalhador? ");
		int qtc = teclado.nextInt();

		for (int i = 1; i <= qtc; i++) {
			System.out.println("entre com os dados do contrato + #" + i + " dados:  ");
			System.out.print("data (dd/mm/aaaa): ");
			Date dataContrato = sdf.parse(teclado.next());
			System.out.print("valor por hora: ");
			double valorPorHora = teclado.nextDouble();
			System.out.print("duração do contrato (horas): ");
			int duracaoContrato = teclado.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, duracaoContrato);
			trabalhador.adicionarContrato(contrato);
		}

		System.out.println();
		System.out.print("entre com o mês e ano para calcular o salário: (mm/aaaa): ");
		String mesAno = teclado.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("nome: " + trabalhador.getNome());
		System.out.println("departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("ganhos para " + mesAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		teclado.close();
	}

}
