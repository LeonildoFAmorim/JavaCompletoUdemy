package expressoes_lambda.problemas_exemplos.servicos;

import java.util.List;
import java.util.function.Predicate;

import expressoes_lambda.problemas_exemplos.entidades.Product;

/* ao inv�s do m�todo comparar diretamente com a letra T,
o m�todo somaPorFiltro recebe predicado (criterio) esse criterio ser� 
fornecido pelo o usu�rio, assim a classe ServicoDeProduto
n�o precisa ser alterada caso mude o crit�rio que nesse caso
� todos os produtos que come�am com a letra T. Isso mant�m a classe
fechada para altera��o.
*/

public class ServicoDeProduto {
	
	public double somaPorFiltro(List<Product> list, Predicate<Product> criterio) {
		double soma = 0.0;
		for (Product product : list) {
			if (criterio.test(product)) {
				soma += product.getPrice();
			}
		}
		return soma;
	}
}
