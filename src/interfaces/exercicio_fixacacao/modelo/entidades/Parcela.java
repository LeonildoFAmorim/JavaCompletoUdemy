package interfaces.exercicio_fixacacao.modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	private Date data;
	private double quantia;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcela(Date data, double quantia) {
		this.data = data;
		this.quantia = quantia;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getQuantia() {
		return quantia;
	}

	public void setValorTotal(double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return sdf.format(data) + " - " + String.format("%.2f", quantia);
	}
}
