package polimorfismo.exercicio_resolvido.entidades;

public class FuncionarioTerceirizado extends Funcionario {
	private double despesaAdicional;

	public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double valorAdicional) {
		super(nome, horasTrabalhadas, valorHora);
		this.despesaAdicional = valorAdicional;
	}

	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
}
