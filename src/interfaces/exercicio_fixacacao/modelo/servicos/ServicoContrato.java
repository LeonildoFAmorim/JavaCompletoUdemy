package interfaces.exercicio_fixacacao.modelo.servicos;

import java.util.Calendar;
import java.util.Date;

import interfaces.exercicio_fixacacao.modelo.entidades.Contrato;
import interfaces.exercicio_fixacacao.modelo.entidades.Parcela;


/* 
 * invers�o de valor e inje��o de deped�ncia:
 * n�o podemos deixar a pr�pria classe respons�vel peloo o controle 
 * de qual instancia ela vai precisar para executar ou seja, quem tem que 
 * controla a deped�ncia de qual objeto vai ser instaciado � outro lugar e n�o 
 * a pr�pria classe, algu�m de fora vai dar um new e injetar a deped�ncia aqui.
 * isso pode ser um construtor ou m�todo set ou algum framework.
 * 
 * ent�o n�o podemos fazer isso:
 * 
 * ServicoDepagamentoOline sv = new ServicoPayPal();
 * 
 * isso gera um alto acoplamento entre as classes, de maneira que se o servi�o de pagamento
 * que no caso � paypal mudar, ent�o precisamos altera o c�digo na classe ServicoContrato e
 * compilar o c�digo novamente, e assim ela n�o ficar� fechada para altera��o.
 * 
*/ 

public class ServicoContrato {
	
	// sempre declaramos uma vari�vel da interface
	
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
