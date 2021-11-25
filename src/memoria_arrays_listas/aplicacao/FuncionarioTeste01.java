package memoria_arrays_listas.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import memoria_arrays_listas.entidades.Funcionario;

public class FuncionarioTeste01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("quantos funcion�rios ser�o cadastrados?");
		int quantidadeFuncionarios = teclado.nextInt();
		teclado.nextLine();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for (int i = 0; i < quantidadeFuncionarios; i++) {
			System.out.println("empregado : " + (i + 1));
			System.out.print("ID : ");
			Integer id = teclado.nextInt();
			teclado.nextLine();
			
			
			// n�o deixa digitar ID repetido
			while(verificaIdRepetido(funcionarios,id)) {
				System.out.println("ID j� existe, digite um ID diferente");
				System.out.print("ID : ");
				id = teclado.nextInt();
				teclado.nextLine();
			}
			
			System.out.print("nome : ");
			String nome = teclado.nextLine();// nextLine() � para ler tudo at� o fima da linah
			
			System.out.println("salario : ");
			double salario = teclado.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			funcionarios.add(funcionario);
		}

		System.out.println("digite o ID para o aumento de sal�rio");
		Integer idAumento = teclado.nextInt();
		Funcionario func = funcionarios.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		if (func == null) {
			System.out.println("esse ID n�o existe");
		} else {
			System.out.println("digite a porcentagem para o aumento de sal�rio");
			double porcentagem = teclado.nextDouble();
			func.calculaAumento(porcentagem);
		}

		for (Funcionario funci : funcionarios) {
			System.out.println(funci);
		}

		
		teclado.close();
	}
	static boolean verificaIdRepetido(List<Funcionario>lista, int id) {
		Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
