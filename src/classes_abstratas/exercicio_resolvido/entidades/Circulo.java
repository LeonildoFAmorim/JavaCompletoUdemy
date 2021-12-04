package classes_abstratas.exercicio_resolvido.entidades;

public class Circulo extends Forma{
	private double raio;
	
	public Circulo() {
		super();// caso mude alguma regra de neg�cio no construtor vazio da classe m�e, essa regra � aplicada aqui tamb�m
	}

	public Circulo(Cores cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
