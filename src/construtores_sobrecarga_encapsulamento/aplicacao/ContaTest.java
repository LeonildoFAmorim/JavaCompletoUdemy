package construtores_sobrecarga_encapsulamento.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import construtores_sobrecarga_encapsulamento.entidades.Conta;

public class ContaTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta conta;
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o número da conta");
		int numero = sc.nextInt();
		System.out.println("digite o usuário");
		sc.nextLine();// consumir a quebra de linha que ficou pendente no nextInt anterior
		String usuario = sc.nextLine();
		System.out.println("vair ter depósito s / n?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("digite o valor do deposito");
			double deposito = sc.nextDouble();
			conta = new Conta(numero,usuario,deposito);
		}else {
			conta = new Conta(numero,usuario);
		}
		System.out.println(conta);
		System.out.println("digite um valor para deposito");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.println(conta);
		System.out.println("digite um valor para saque");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		System.out.println(conta);
		sc.close();
	}
}
