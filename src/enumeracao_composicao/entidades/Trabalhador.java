package enumeracao_composicao.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	private String nome;
	private NivelDoTrabalhador nivel;
	private double salarioBase;
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();// quando temos uma composição tem muitos, no caso aqui é
																// do tipo List, não a incluímos no construtor,
	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelDoTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratoHora() {
		return contratos;
	}

	public void adicionarContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		for (ContratoHora contrato : contratos) {
			calendario.setTime(contrato.getData());
			int anoContrato = calendario.get(Calendar.YEAR);
			int mesContrato = 1 + calendario.get(Calendar.MONTH);// mês do Calendar sempre começa com zero
			if (ano == anoContrato && mes == mesContrato) {
				soma += contrato.valorTotal();
			}
		}
		return soma;
	}
}
