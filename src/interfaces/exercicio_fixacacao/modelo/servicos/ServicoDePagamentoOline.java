package interfaces.exercicio_fixacacao.modelo.servicos;

public interface ServicoDePagamentoOline {
	
	double taxaDePagamento (double quantia);
	double imposto(double quantia, int meses);
}
