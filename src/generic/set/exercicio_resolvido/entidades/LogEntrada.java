package generic.set.exercicio_resolvido.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class LogEntrada {
	private String nome;
	private Date data;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public LogEntrada(String nome, Date data) {
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntrada other = (LogEntrada) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "LogEntrada [nome=" + nome + ", data=" + sdf.format(data) + "]";
	}
}
