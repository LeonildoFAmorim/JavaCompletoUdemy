package excecoes.exercicio_fixacao.entidades;

public class ContaBancaria {
	private int numero;
    private String nomeDono;
    private double saldo;
    private double limiteSaque;

    public ContaBancaria(){

    }

    public ContaBancaria(int numero, String nomeDono, double saldo, double limiteSaque) {
        this.numero = numero;
        this.nomeDono = nomeDono;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        validaSaque(valor);
        this.saldo -= valor;
    }

    private void validaSaque(double valor) {
        if (valor > saldo) {
            throw new ExcecaoDeNegocio("Saldo insuficiente");
        }
        if (valor > limiteSaque){
            throw new ExcecaoDeNegocio ("Limite de saque excedido");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", nomeDono='" + nomeDono + '\'' +
                ", saldo=" + saldo +
                ", limiteSaque=" + limiteSaque +
                '}';
    }
}
