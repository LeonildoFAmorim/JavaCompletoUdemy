package interfaces.exercicio_fixacacao.modelo.servicos;

public class ServicoPayPal implements ServicoDePagamentoOline {
	
	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double JURO_MENSAL = 0.01;
	
	// os métodos são implementados com base na regra de negócio do payPal (ver exercicio).
	@Override
	public double taxaDePagamento(double quantia) {
		return quantia * TAXA_PAGAMENTO;
	}

	@Override
	public double juros(double quantia, int meses) {
		return quantia * JURO_MENSAL * meses ;
	}
}
