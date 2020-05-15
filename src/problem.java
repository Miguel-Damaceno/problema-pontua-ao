import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double qtdcompras, ticketmedio, atrasos, ptscompras=0;
		char modopagamento;
		
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
		
		//Leitura de outros dados//
		System.out.println("");
		System.out.printf("Quantas vezes o cliente atrasou o pagamento?");
		atrasos = sc.nextDouble();
		System.out.printf("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)?");
		modopagamento = sc.next().charAt(0);
		
		//Score de volume de compras//
		if (qtdcompras == 0) {
			ptscompras = 0;
			System.out.println("");
			System.out.printf("Score de volume de compras = " + ptscompras);
		}
		else if (ticketmedio <= 3000 && qtdcompras <= 2) {
			ptscompras = 20;
			System.out.println("");
			System.out.printf("Score de volume de compras = " + ptscompras);
		}
		else if (ticketmedio <= 3000 && qtdcompras > 2) {
			ptscompras = 40;
			System.out.println("");
			System.out.printf("Score de volume de compras = " + ptscompras);
		}
		else if (ticketmedio > 3000) {
			ptscompras = 60;
			System.out.println("");
			System.out.printf("Score de volume de compras = " + ptscompras);
		}
		else {
			ptscompras = 0;
		}
		
		
		
		sc.close();
	}

}
