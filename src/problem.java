import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double qtdcompras, ticketmedio, atrasos;
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
		
		sc.close();
	}

}
