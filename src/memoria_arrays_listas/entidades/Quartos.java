package memoria_arrays_listas.entidades;

public class Quartos {
	private String nome;
	private String email;
	private int numeroQuarto;
	
	public Quartos(String nome, String email, int numeroQuarto) {
		this.nome = nome;
		this.email = email;
		this.numeroQuarto = numeroQuarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return numeroQuarto;
	}

	public void setQuarto(int quarto) {
		this.numeroQuarto = quarto;
	}
}
