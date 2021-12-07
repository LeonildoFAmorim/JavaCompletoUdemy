package excecoes.problema_exemplo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private int numeroQuarto;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // static para não ficar criando um novo
																				// sdf cada vez que um objeto dessa
																				// classe for instaciada
	public Reserva(int numeroQuarto, Date checkin, Date checkout) {
		//validaNumeroQuarto(numeroQuarto);
		validaDatas(checkin, checkout);
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public long duracao() {
		long diferenca = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}

	private void validaDatas(Date checkin, Date checkout) {
		Date agora = new Date();
		if (checkin.before(agora) || checkout.before(agora)) {
			throw new ExcecaoDeNegocio("A data  precisa ser uma data futura");
		}
		if (!checkout.after(checkin)) {
			throw new ExcecaoDeNegocio("A data checkin deve ser menor que a data de checkout");
		}
	}

	public void atualizaReserva(Date checkin, Date checkout) {
		validaDatas(checkin, checkout);
		this.checkin = checkin;
		this.checkout = checkout;
	}

	private void validaNumeroQuarto(int numero) {
		if (numero < 0) {
			throw new ExcecaoDeNegocio("O numero do quarto nao pode ser menor que zero");
		}
	}

	@Override
	public String toString() {
		return "Reserva numeroQuarto =" + numeroQuarto + ", checkin =" + sdf.format(checkin) + ", checkout ="
				+ sdf.format(checkout) + ", duracao= " + duracao() + " noites";
	}
}
