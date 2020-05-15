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
		
		
		int VOLUMEC;
		double TICKETM;
		
		System.out.print("Quantas compras o cliente fez no último ano? ");
		VOLUMEC = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		TICKETM = sc.nextDouble();
		
		
		

	}

}
