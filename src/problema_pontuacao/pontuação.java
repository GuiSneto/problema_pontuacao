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

		
		// Declara��o das variaveis
		int VOLUMEC,ATRPAG,SCOREVOLUMEC = 0,SCOREINAD = 0, SCOREPAG = 0, RESULTADOFINAL;
		double TICKETM;
		char FORMPAG;
		
		
		// Leitura dos dados
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		VOLUMEC = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		TICKETM = sc.nextDouble();
		System.out.println("");

		
		//Leitura de outros dados
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		ATRPAG = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		FORMPAG = sc.next().charAt(0);
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
		
		System.out.println("Score de volume de compras = " + SCOREVOLUMEC + " pontos");
		System.out.println("");

		
		
		//calculo inadiplencia e pag
		
		if (ATRPAG > 1 || VOLUMEC == 0) {
			SCOREINAD = 0;
			
		}
		else if (ATRPAG >= 1 && VOLUMEC >= 1) {
			SCOREINAD = 15;
		}
		else if (ATRPAG == 0 && VOLUMEC >= 1) {
			SCOREINAD = 30;
		}
		
		System.out.println("Score de inadimpl�ncia = "+ SCOREINAD + " pontos");
		
		// calculo formpag
		
		if (VOLUMEC >= 1 && FORMPAG == 'D') {
			SCOREPAG = 5;
			
		}
		else if (VOLUMEC >= 1 && FORMPAG == 'C') {
			SCOREPAG = 10;
		}
		else if (VOLUMEC >= 1 && FORMPAG == 'B') {
			SCOREPAG = 10;
		}
		
		System.out.println("Score de forma de pagamento = " + SCOREPAG + " pontos");
		System.out.println("");
		
		
		//calculo final
		
		RESULTADOFINAL = SCOREPAG + SCOREINAD + SCOREVOLUMEC;
		
		if (RESULTADOFINAL <= 25) {
			System.out.println("Classifica��o final =  CLIENTE BRONZE");
		}
		else if (RESULTADOFINAL > 25 && RESULTADOFINAL <= 75) {
			System.out.println("Classifica��o final =  CLIENTE PRATA");
		}
		else if (RESULTADOFINAL > 75) {
			System.out.println("Classifica��o final =  CLIENTE OURO");
		}
		
		
		
		

	}

}
