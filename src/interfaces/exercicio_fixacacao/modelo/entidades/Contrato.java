package interfaces.exercicio_fixacacao.modelo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numeroContrato;
	private Date data;
	private double valorTotal;
	
	private static List <Parcela> parcelas = new ArrayList<>();

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

	public List<Parcela> getParcelas() {
		return parcelas;
	}
	
	public void addParcela(Parcela parcela) {
		parcelas.add(parcela);
	}
}
