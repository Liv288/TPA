import java.util.Scanner;
public class viagem {
	public static void main (String arg[]) {
		Scanner in = new Scanner(System.in);
		double reais, convertido, viagem, cotacao;
		
		System.out.println("Se sua viagem for nacional escreva 1, se for europeia escreva 2, se for Norte-americana escreva 3 e se for Sul-americana escreva 4");
		viagem = in.nextDouble();
		System.out.println("Escreva quanto dinheiro voc� vai levar em Reais");
		reais = in.nextDouble();
		System.out.println("Escreva o valor da cota��o");
		cotacao = in.nextDouble();
		if (viagem==1) {
			System.out.println("Sua viagem � nacional e o valor convertido � " +reais);
		}else if (viagem==2) {
			convertido=reais/cotacao; 
			System.out.printf("Sua viagem � europeia e o valor convertido � %.2f \n " ,convertido);
		}else if (viagem==3) {
			convertido=reais/cotacao;
			System.out.printf("Sua viagem � Norte-Americana e o valor convertido � %.2f \n " ,convertido);
		}else {
			convertido=reais*cotacao;
			System.out.println("Sua viagem � Sul-Americana e o valor convertido � " +convertido);
		}
		in.close();
	}
}
