package tomadadecisao;
import java.util.Scanner;
public class Numero {
	public static void main (String args[]) {
		java.util.Scanner in = new Scanner (System.in);
		double n;
		
		System.out.println("Escreva um número qualquer");
		n = in.nextDouble ();
		
		if (n==0) {
			System.out.println("Seu número é neutro");
		}else if (n>0) {
			System.out.println("Seu número é positivo");
		}else {
			System.out.println("Seu número é negativo");
	    in.close();
		}
	}
}
