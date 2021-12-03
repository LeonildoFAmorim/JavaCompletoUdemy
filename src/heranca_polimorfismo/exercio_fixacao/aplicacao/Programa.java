package heranca_polimorfismo.exercio_fixacao.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.exercio_fixacao.entidades.Produto;
import heranca_polimorfismo.exercio_fixacao.entidades.ProdutoImportado;
import heranca_polimorfismo.exercio_fixacao.entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> produtos = new ArrayList<>();

		System.out.print("Entre com a quantidade de produtos: ");
		int qtdP = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= qtdP; i++) {
			System.out.println("Dados do produto #" + i);
			System.out.print("comum, usado, ou importado : escolha (c, u, i): ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Valor do produto: ");
			double valorProduto = sc.nextDouble();
			if (tipo == 'c') {
				produtos.add(new Produto(nomeProduto, valorProduto));
			} else if (tipo == 'i') {
				System.out.print("Taxa alfandega: ");
				double taxaAlfandega = sc.nextDouble();
				produtos.add(new ProdutoImportado(nomeProduto, valorProduto, taxaAlfandega));
			} else {
				System.out.print("Data de fabricacao: (DD/MM/AAAA): ");
				Date dataFabricacao = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nomeProduto, valorProduto, dataFabricacao));
			}
		}
		System.out.println();
		System.out.println("Lista de produtos: ");
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		sc.close();
	}
}
