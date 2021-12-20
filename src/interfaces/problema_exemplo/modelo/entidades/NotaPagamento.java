package interfaces.problema_exemplo.modelo.entidades;

public class NotaPagamento {
	private Double pagamentoBase; // Double wrapper porque se um dia esse sistema for para um banco de dados, o
									// atributo terá a possibilidade de ser nulo.
	private Double imposto;

	public NotaPagamento() {

	}

	public NotaPagamento(Double pagamentoBase, Double imposto) {
		this.pagamentoBase = pagamentoBase;
		this.imposto = imposto;
	}

	public double getPagamentoBase() {
		return pagamentoBase;
	}

	public void setPagamentoBase(Double pagamentoBase) {
		this.pagamentoBase = pagamentoBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public Double getPagamentoTotal() {// aqui está como método get e não método comum porque na definição da classe no
										// exercicio está como atributo calculável e não como método
		return getPagamentoBase() + getImposto();
	}
}
