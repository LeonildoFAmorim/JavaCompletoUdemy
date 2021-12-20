package interfaces.problema_exemplo.modelo.entidades;

public class NotaPagamento {
	private Double pagamentoBase; // Double wrapper porque se um dia esse sistema for para um banco de dados, o
									// atributo ter� a possibilidade de ser nulo.
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

	public Double getPagamentoTotal() {// aqui est� como m�todo get e n�o m�todo comum porque na defini��o da classe no
										// exercicio est� como atributo calcul�vel e n�o como m�todo
		return getPagamentoBase() + getImposto();
	}
}
