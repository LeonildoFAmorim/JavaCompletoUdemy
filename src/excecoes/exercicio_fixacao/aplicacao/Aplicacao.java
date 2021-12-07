package excecoes.exercicio_fixacao.aplicacao;

import java.util.Scanner;

import excecoes.exercicio_fixacao.entidades.ContaBancaria;
import excecoes.exercicio_fixacao.entidades.ExcecaoDeNegocio;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os dados da conta:");
        System.out.print("Numero da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Dono da conta: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = scanner.nextDouble();
        ContaBancaria contaBancaria = new ContaBancaria(numero, nome, saldoInicial, limiteSaque);
        System.out.println(contaBancaria);
        System.out.println();

        System.out.print("Entre com um valor para depositar: ");
        double deposito = scanner.nextDouble();
        contaBancaria.depositar(deposito);
        System.out.println("Atualizando a conta apos o deposito:");
        System.out.println(contaBancaria);
        System.out.print("Entre com um valor para saque: ");
        double saque = scanner.nextDouble();
        try {
            contaBancaria.sacar(saque);
            System.out.println("Atualizando a conta apos o saque:");
            System.out.println(contaBancaria);
        } catch (ExcecaoDeNegocio e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
