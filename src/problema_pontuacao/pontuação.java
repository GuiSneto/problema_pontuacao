package problema_pontuacao;

//bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class pontuação {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // idioma US
		Scanner sc = new Scanner(System.in); // leitura de dados
		
		// CABEÇALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("-----------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println("");
		System.out.println("");
		
		// Declaração das variaveis
		int VOLUMEC,ATRPAG;
		double TICKETM;
		char FORMPAG;
		
		
		// Leitura dos dados
		System.out.print("Quantas compras o cliente fez no último ano? ");
		VOLUMEC = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		TICKETM = sc.nextDouble();
		System.out.println("");
		System.out.println("");
		
		
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		ATRPAG = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		FORMPAG = sc.next().charAt(0);
		System.out.println("");
		System.out.println("");
		
		
		
		
		
		

	}

}
