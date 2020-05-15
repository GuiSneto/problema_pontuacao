package problema_pontuacao;

//bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class pontua��o {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // idioma US
		Scanner sc = new Scanner(System.in); // leitura de dados
		
		// CABE�ALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("-----------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println("");
		System.out.println("");
		
		// Declara��o das variaveis
		int VOLUMEC,ATRPAG,SCOREVOLUMEC = 0;
		double TICKETM;
		char FORMPAG;
		
		
		// Leitura dos dados
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		VOLUMEC = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		TICKETM = sc.nextDouble();
		System.out.println("");
		System.out.println("");
		
		//Leitura de outros dados
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		ATRPAG = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		FORMPAG = sc.next().charAt(0);
		System.out.println("");
		System.out.println("");
		
		//calculo score volume
		
		if (VOLUMEC == 0) {
			SCOREVOLUMEC = 0;
		}
		else if (VOLUMEC*TICKETM <= 3000 && VOLUMEC <= 2) {
			SCOREVOLUMEC = 20;
		}
		else if (VOLUMEC*TICKETM <= 3000 && VOLUMEC > 2) {
			SCOREVOLUMEC = 40;
		}
		else if (VOLUMEC*TICKETM > 3000) {
			SCOREVOLUMEC = 60 ;
		}
		
		System.out.println("Score de volume de compras = " + SCOREVOLUMEC);
		System.out.println("");
		System.out.println("");
		
		
		
		
		
		
		
		
		

	}

}
