package tomadadecisao;
import java.util.Scanner;
public class Numero {
	public static void main (String args[]) {
		java.util.Scanner in = new Scanner (System.in);
		double n;
		
		System.out.println("Escreva um n�mero qualquer");
		n = in.nextDouble ();
		
		if (n==0) {
			System.out.println("Seu n�mero � neutro");
		}else if (n>0) {
			System.out.println("Seu n�mero � positivo");
		}else {
			System.out.println("Seu n�mero � negativo");
	    in.close();
		}
	}
}
