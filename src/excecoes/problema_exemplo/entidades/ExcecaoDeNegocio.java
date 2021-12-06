package excecoes.problema_exemplo.entidades;

public class ExcecaoDeNegocio extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ExcecaoDeNegocio (String msg) {
	super(msg);
	}
}
