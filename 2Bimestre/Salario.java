package tomadadecisao;
import java.util.Scanner;
public class Salario {
	public static void main (String args [] ) {
	 Scanner in = new Scanner (System.in) ;
	 double s;
	 
	 System.out.println ("Escreva o seu sal�rio.");
	 s = in.nextDouble();
	 
	 if(s>1302.00) {
		 System.out.println("Seu sal�rio � maior que um sal�rio m�ninmo");
		}else if (s<1302.00) {
			System.out.println("Seu sal�rio � menor que um sal�rio m�nimo");
		}else { 
			System.out.println("Seu sal�rio � igual ao sal�rio m�nimo");
			in.close();
		}
	}
}
