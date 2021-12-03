package heranca_polimorfismo.exercio_fixacao.entidades;

public class ProdutoImportado extends Produto {
	private double taxaAlfandega;

	public ProdutoImportado() {

	}

	public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public double precoTotal() {
		return getPreco() + taxaAlfandega;
	}

	@Override
	public String toString() {
		return getNome() + " $ " + String.format("%.2f", precoTotal()) + " (Taxa de alfandega: " + taxaAlfandega + ")";

	}
}
