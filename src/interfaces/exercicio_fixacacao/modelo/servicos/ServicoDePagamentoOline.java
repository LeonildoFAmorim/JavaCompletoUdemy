package interfaces.exercicio_fixacacao.modelo.servicos;

public interface ServicoDePagamentoOline {
	
	double taxaDePagamento (double quantia); // não precisa colocar o modificador de acesso, porque em interface presume-se que o método é publico e abstrato.
	double juros(double quantia, int meses);
}
