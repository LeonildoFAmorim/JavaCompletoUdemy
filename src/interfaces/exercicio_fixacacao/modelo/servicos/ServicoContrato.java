package interfaces.exercicio_fixacacao.modelo.servicos;

import java.util.Calendar;
import java.util.Date;

import interfaces.exercicio_fixacacao.modelo.entidades.Contrato;
import interfaces.exercicio_fixacacao.modelo.entidades.Parcela;


/* 
 * inversão de valor e injeção de depedência:
 * não podemos deixar a própria classe responsável peloo o controle 
 * de qual instancia ela vai precisar para executar ou seja, quem tem que 
 * controla a depedência de qual objeto vai ser instaciado é outro lugar e não 
 * a própria classe, alguém de fora vai dar um new e injetar a depedência aqui.
 * isso pode ser um construtor ou método set ou algum framework.
 * 
 * então não podemos fazer isso:
 * 
 * ServicoDepagamentoOline sv = new ServicoPayPal();
 * 
 * isso gera um alto acoplamento entre as classes, de maneira que se o serviço de pagamento
 * que no caso é paypal mudar, então precisamos altera o código na classe ServicoContrato e
 * compilar o código novamente, e assim ela não ficará fechada para alteração.
 * 
*/ 

public class ServicoContrato {
	
	// sempre declaramos uma variável da interface
	
	ServicoDePagamentoOline servicoDePagamentoOline;
	
	public ServicoContrato(ServicoDePagamentoOline servicoDePagamentoOline) {
		this.servicoDePagamentoOline = servicoDePagamentoOline;
	}
	
	public void processarContrato (Contrato contrato, int meses) {
		double parcelaBasica = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			double valorParcelaComJuros = parcelaBasica + servicoDePagamentoOline.juros(parcelaBasica, i); // aqui foi aplicado a taxa de juro, 1 % a cada parcela.
			double valorTotalParcela = valorParcelaComJuros + servicoDePagamentoOline.taxaDePagamento(valorParcelaComJuros); // aqui foi aplicado 2 %, taxa de pagamento.
			Date dataVencimento = adicionaMes(contrato.getData(), i);
			contrato.getParcelas().add(new Parcela(dataVencimento, valorTotalParcela));
		}
	}
	
	private Date adicionaMes (Date data, int mes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, mes);
		return calendar.getTime();	
	}
}
