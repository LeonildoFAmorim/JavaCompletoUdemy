package interfaces.exercicio_fixacacao.modelo.servicos;

public interface ServicoDePagamentoOline {
	
	double taxaDePagamento (double quantia); // n�o precisa colocar o modificador de acesso, porque em interface presume-se que o m�todo � publico e abstrato.
	double juros(double quantia, int meses);
}
