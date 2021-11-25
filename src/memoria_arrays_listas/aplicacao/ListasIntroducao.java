package memoria_arrays_listas.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListasIntroducao {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("leonildo");
		lista.add("marinalva");
		lista.add("giovana");
		lista.add("gabriel");
		lista.add("liza");

		System.out.println("------------------------------");
		for (String list : lista) {
			System.out.println(list);
		}

		System.out.println(lista.get(3));
		System.out.println("------------------------------");
		lista.add(2, "vovo");
		System.out.println(lista.size());
		// lista.remove("liza");
		System.out.println("índex de vovo : " + lista.indexOf("vovo"));

		lista.removeIf(x -> x.charAt(0) == 'g'); // predicado, está removendo todos que começam com g

		for (String list : lista) {
			System.out.println(list);
		}
		System.out.println("------------------------------");

		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'l').collect(Collectors.toList());
		// filtrando os nomes que começam com a letra l

		for (String list : resultado) {
			System.out.println(list);
		}
		
		System.out.println("-----------------------");
		// encontrando um elemento por um predicado
		String nome = lista.stream().filter(x -> x.charAt(0) == 'h').findFirst().orElse(null);
		System.out.println(nome);
	}

}
