import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double qtdcompras, ticketmedio;
		
		// Cabe�alho //
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println("");
		
		// Leitura do volume //
		System.out.printf("Quantas compras o cliente fez no �ltimo ano?");
		qtdcompras = sc.nextDouble();
		System.out.printf("Qual o ticket m�dio?");
		ticketmedio = sc.nextDouble();
		
		sc.close();
	}

}
