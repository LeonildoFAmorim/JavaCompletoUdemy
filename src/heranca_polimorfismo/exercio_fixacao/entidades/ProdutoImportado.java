package heranca_polimorfismo.exercio_fixacao.entidades;

public class ProdutoImportado extends Produto{
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

	@Override
	public String toString() {
		return "Produto: " + super.getNome() + " Valor: " + (super.getPreco() + taxaAlfandega) + " (Taxa de alfandega: " + taxaAlfandega + ")";
				
	}
}
