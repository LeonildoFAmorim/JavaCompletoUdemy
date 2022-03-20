package interfaces.exercicio_fixacacao.modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	private Date dataVencimento;
	private double quantia;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcela(Date data, double quantia) {
		this.dataVencimento = data;
		this.quantia = quantia;
	}

	public Date getData() {
		return dataVencimento;
	}

	public void setData(Date data) {
		this.dataVencimento = data;
	}

	public double getQuantia() {
		return quantia;
	}

	public void setValorTotal(double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return sdf.format(dataVencimento) + " - " + String.format("%.2f", quantia);
	}
}
