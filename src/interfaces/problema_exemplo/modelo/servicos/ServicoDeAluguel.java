package interfaces.problema_exemplo.modelo.servicos;

import interfaces.problema_exemplo.modelo.entidades.AluguelCarro;
import interfaces.problema_exemplo.modelo.entidades.NotaPagamento;

public class ServicoDeAluguel {
	private Double precoHora;
	private Double precoDia;

	private ServicoImposto servicoImposto;
	
	public ServicoDeAluguel() {

	}

	public ServicoDeAluguel(Double precoHora, Double precoDia, ServicoImpostoBrasil servicoImposto) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.servicoImposto = servicoImposto;
	}

	// gerar a nota de pagamento.
	public void processarNotaPagamento(AluguelCarro aluguelCarro) {
		long dataInicio = aluguelCarro.getInicioAluguel().getTime();// terá um valor em milisegundos
		long dataFim = aluguelCarro.getFimAluguel().getTime();
		double horas = (double) (dataFim - dataInicio) / 1000 / 60 / 60; // convertendo o resultado de milisegundos em
																			// segundos, depois para minutos e depois
																			// para horas
		double pagamentoBase = 0;
		if (horas <= 12) {// caso foi menos de um dia
			pagamentoBase = Math.ceil(horas) * precoHora; // ceil arredonda um valor para cima
		} else {
			pagamentoBase = Math.ceil(horas) * precoDia;
		}
		double imposto = servicoImposto.imposto(pagamentoBase);
		aluguelCarro.setNotaPagamento(new NotaPagamento(pagamentoBase, imposto));
	}
}
