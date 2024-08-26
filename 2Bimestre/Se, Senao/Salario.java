package tomadadecisao;
import java.util.Scanner;
public class Salario {
	public static void main (String args [] ) {
	 Scanner in = new Scanner (System.in) ;
	 double s;
	 
	 System.out.println ("Escreva o seu salário.");
	 s = in.nextDouble();
	 
	 if(s>1302.00) {
		 System.out.println("Seu salário é maior que um salário míninmo");
		}else if (s<1302.00) {
			System.out.println("Seu salário é menor que um salário mínimo");
		}else { 
			System.out.println("Seu salário é igual ao salário mínimo");
			in.close();
		}
	}
}
