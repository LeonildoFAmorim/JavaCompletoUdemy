package excecoes.exercicio_fixacao.entidades;


public class ExcecaoDeNegocio extends RuntimeException {
    public ExcecaoDeNegocio(String msg) {
        super(msg);
    }
}
