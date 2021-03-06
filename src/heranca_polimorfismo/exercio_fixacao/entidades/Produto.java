package heranca_polimorfismo.exercio_fixacao.entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	protected String nome;
	protected double preco;

	public Produto() {

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return nome + " $ " + String.format("%.2f", preco);
	}
}
