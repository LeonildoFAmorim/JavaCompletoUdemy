package interfaces.exercicio_fixacacao.modelo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numeroContrato;
	private Date data;
	private double valorTotal;
	
	private static List <Parcela> parcelas = new ArrayList<Parcela>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numeroContrato, Date data, double valorTotal) {
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	/* no caso de listas, coleções não colocamoso o método set, porque não faz
	 sentido trocar a lista que está associada ao objeto. É permitido adicionar 
	 e remover elementos na lista, mas nunca trocar a lista.:*/
	
	public List<Parcela> getParcelas() {
		return parcelas;
	}
	
	public void adicionarParcela(Parcela parcela) {
		parcelas.add(parcela);
	}
	
	public void removeParcela(Parcela parcela) {
		parcelas.remove(parcela);
	}
}
