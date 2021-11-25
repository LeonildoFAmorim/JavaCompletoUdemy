package construtores_sobrecarga_encapsulamento.entidades;

public class Conta {

	private int numeroConta;
	private String titular;
	private double saldo;
	
	public Conta(int numeroConta, String titular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		depositar(depositoInicial);
	}
	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void sacar(double quantia) {
		this.saldo -= quantia + 5;
	}
	
	public void depositar(double quantia) {
		this.saldo += quantia;
	}
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}
