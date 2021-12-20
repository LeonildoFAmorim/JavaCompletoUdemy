package interfaces.exercicio_fixacacao.modelo.entidades;

import java.util.Date;

public class Parcela {
	private Date data;
	private double valorTotal;
	
	public Parcela(Date data, double valorTotal) {
		this.data = data;
		this.valorTotal = valorTotal;
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
}
