package memoria_arrays_listas.entidades;

import java.util.List;

public class Funcionario {
	private Integer Id;
	private String nome;
	private double salario;
	
	public Funcionario(Integer id, String nome, double salario) {
		this.Id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaAumento(double porcentagem) {
		return (salario += salario * porcentagem / 100);
	}

	@Override
	public String toString() {
		return Id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
