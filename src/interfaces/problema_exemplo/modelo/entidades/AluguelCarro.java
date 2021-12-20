package interfaces.problema_exemplo.modelo.entidades;

import java.util.Date;

public class AluguelCarro {
	private Date inicioAluguel;
	private Date fimAluguel;

	private Veiculo veiculo;
	private NotaPagamento notaPagamento;

	public AluguelCarro() {

	}

	public AluguelCarro(Date inicioAluguel, Date fimAluguel, Veiculo veiculo) {// notaPagamento não entra no construtor
																				// porque de acordo com o diagrama ele
																				// pode ter 0 ou 1 notaPagamento, ou
																				// seja, ela pode ser nula, e por isso
																				// não pode ser obrigada a colocar no
																				// construtor
		this.inicioAluguel = inicioAluguel;
		this.fimAluguel = fimAluguel;
		this.veiculo = veiculo;
	}

	public Date getInicioAluguel() {
		return inicioAluguel;
	}

	public void setInicioAluguel(Date inicioAluguel) {
		this.inicioAluguel = inicioAluguel;
	}

	public Date getFimAluguel() {
		return fimAluguel;
	}

	public void setFimAluguel(Date fimAluguel) {
		this.fimAluguel = fimAluguel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaPagamento getNotaPagamento() {
		return notaPagamento;
	}

	public void setNotaPagamento(NotaPagamento notaPagamento) {
		this.notaPagamento = notaPagamento;
	}
}
