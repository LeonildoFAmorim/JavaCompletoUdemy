package expressoes_lambda.problemas_exemplos.servicos;

import java.util.List;
import java.util.function.Predicate;

import expressoes_lambda.problemas_exemplos.entidades.Product;

/* ao invés do método comparar diretamente com a letra T,
o método somaPorFiltro recebe predicado (criterio) esse criterio será 
fornecido pelo o usuário, assim a classe ServicoDeProduto
não precisa ser alterada caso mude o critério que nesse caso
é todos os produtos que começam com a letra T. Isso mantém a classe
fechada para alteração.
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
