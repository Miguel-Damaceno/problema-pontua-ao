import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double qtdcompras, ticketmedio, atrasos, ptscompras=0, ptsinad=0, ptspag=0, total=0;
		char modopagamento;
		
		// Cabeçalho //
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println("");
		
		// Leitura do volume //
		System.out.printf("Quantas compras o cliente fez no último ano?");
		qtdcompras = sc.nextDouble();
		System.out.printf("Qual o ticket médio?");
		ticketmedio = sc.nextDouble();
		
		//Leitura de outros dados//
		System.out.println("");
		System.out.printf("Quantas vezes o cliente atrasou o pagamento?");
		atrasos = sc.nextDouble();
		System.out.printf("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?");
		modopagamento = sc.next().charAt(0);
		
		//Score de volume de compras//
		if (qtdcompras == 0) {
			ptscompras = 0;
		}
		else if (ticketmedio <= 3000 && qtdcompras <= 2) {
			ptscompras = 20;
		}
		else if (ticketmedio <= 3000 && qtdcompras > 2) {
			ptscompras = 40;
		}
		else if (ticketmedio > 3000) {
			ptscompras = 60;
		}
		else {
			ptscompras = 0;
		}
		
		System.out.println("");
		System.out.println("Score de volume de compras = " + ptscompras + " pontos");
		
		//Scores de inadimplencia e pagamento//
		//inadimplencia//
		System.out.println("");
		
		if (atrasos > 1 || qtdcompras == 0) {
			ptsinad = 0;
		}
		else if (qtdcompras > 0 && atrasos == 1) {
			ptsinad = 15;
		}
		if (qtdcompras > 0 && atrasos == 0) {
			ptsinad = 30;
		}
		
		System.out.println("Score de inadimplência = " + ptsinad + " pontos");
		
		//forma de pagamento//
		if (qtdcompras > 0 && modopagamento == 'd' || modopagamento == 'D') {
			ptspag = 5;
		}
		if (qtdcompras > 0 && modopagamento == 'c' || modopagamento == 'C' || modopagamento == 'b' || modopagamento == 'B') {
			ptspag = 10;
		}
		System.out.println("Score de forma de pagamento = " + ptspag + " pontos");
		
		//Classificação final//
		System.out.println("");
		total = ptscompras + ptsinad + ptspag;
		if (total <= 25) {
			System.out.println("Classificação final = CLIENTE BRONZE");
		}
		else if (total > 25 && total < 75.1) {
			System.out.println("Classificação final = CLIENTE PRATA");
		}
		if (total > 75) {
			System.out.println("Classificação final = CLIENTE OURO");
		}
		
		
		
		
		sc.close();
	}

}
