import java.util.Scanner;
public class viagem {
	public static void main (String arg[]) {
		Scanner in = new Scanner(System.in);
		double reais, convertido, viagem, cotacao;
		
		System.out.println("Se sua viagem for nacional escreva 1, se for europeia escreva 2, se for Norte-americana escreva 3 e se for Sul-americana escreva 4");
		viagem = in.nextDouble();
		System.out.println("Escreva quanto dinheiro você vai levar em Reais");
		reais = in.nextDouble();
		System.out.println("Escreva o valor da cotação");
		cotacao = in.nextDouble();
		if (viagem==1) {
			System.out.println("Sua viagem é nacional e o valor convertido é " +reais);
		}else if (viagem==2) {
			convertido=reais/cotacao; 
			System.out.printf("Sua viagem é europeia e o valor convertido é %.2f \n " ,convertido);
		}else if (viagem==3) {
			convertido=reais/cotacao;
			System.out.printf("Sua viagem é Norte-Americana e o valor convertido é %.2f \n " ,convertido);
		}else {
			convertido=reais*cotacao;
			System.out.println("Sua viagem é Sul-Americana e o valor convertido é " +convertido);
		}
		in.close();
	}
}
