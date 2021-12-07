package excecoes.problema_exemplo.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excecoes.problema_exemplo.entidades.ExcecaoDeNegocio;
import excecoes.problema_exemplo.entidades.Reserva;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Numero do quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Chechin (dd/mm/aaaa): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Checkout (dd/mm/aaaa): ");
			Date checkout = sdf.parse(sc.next());
			Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
			System.out.println(reserva);
			System.out.println();

			System.out.println("Entre com os dados para atualizacao da reserva");
			System.out.print("Checkin: ");
			checkin = sdf.parse(sc.next());
			System.out.print("Checkout: ");
			checkout = sdf.parse(sc.next());
			reserva.atualizaReserva(checkin, checkout);
			System.out.println();
			System.out.println("Reserva atualizada:");
			System.out.println(reserva);
		} catch (ParseException e) {
			System.out.println("Data no formato invalido");

		} catch (ExcecaoDeNegocio e) {
			System.out.println("Erro ao reservar: " + e.getMessage());

		} catch (RuntimeException e) {
			System.out.println("Digite um valor valido");
		}
	}

}
