package interfaces.problema_exemplo.modelo.entidades;

public class Veiculo {
	private String modelo;
	
	public Veiculo() {
		
	}

	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}