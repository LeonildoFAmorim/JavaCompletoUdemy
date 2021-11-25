package calendario_datas_matriz_gitHub;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoCalendar {

	public static void main(String[] args) throws ParseException { 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dataAtual = new Date();
		
		System.out.println("data atual: " + sdf.format(dataAtual));
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataAtual);
		calendario.add(Calendar.HOUR, 4);// adicionando 4 horas
		dataAtual = calendario.getTime();
		System.out.println("data adico: " + sdf.format(dataAtual));
		int mes = 1 + calendario.get(Calendar.MONTH);// adiciona 1 porque mês começa com zero
		System.out.println("Mês: " + mes);
	}

}
