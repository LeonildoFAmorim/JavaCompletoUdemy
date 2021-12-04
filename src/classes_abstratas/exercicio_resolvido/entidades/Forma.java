package classes_abstratas.exercicio_resolvido.entidades;

public abstract class Forma {// não pode ser instaciada, apenas pode ser extendida
	private Cores cor;
	
	public Forma() {
		
	}

	public Forma(Cores cor) {
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}
	
	public abstract double area(); // quando o método é abstrato obrigatoriamente a classe também precisa ser abstrata
}
