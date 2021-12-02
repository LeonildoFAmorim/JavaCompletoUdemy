package heranca_polimorfismo.exercicio_resolvido.entidades;

public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;

	public Funcionario() {

	}

	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double pagamento() {
		return valorHora * horasTrabalhadas;
	}
}
