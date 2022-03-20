package interfaces.exercicio_fixacacao.modelo.servicos;

public interface ServicoDePagamentoOline {
	
	double taxaDePagamento (double quantia);
	double juros(double quantia, int meses);
}
