package listaComplementar;
import java.util.Scanner;
public class Cotacao {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		double euro, cotacao, r;
		
		System.out.println("Digite o valor em euro");
		euro = in.nextDouble();
		
		System.out.println("Digite o valor da cotaçao em euro");
		cotacao = in.nextDouble();
				
		r = euro*cotacao;
		
		System.out.println("O valor em reais é " +r);
		
		in.close();
	}
}
