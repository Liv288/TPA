package tomadadecisao;
import java.util.Scanner;
public class Temperatura {
	public static void main (String args []) {
		Scanner in= new Scanner (System.in);
		double f, c;
		
	System.out.println("Escreva a temperatura em Fahrenheit.");
	f = in.nextDouble();
	
	c = ((f-32)/1.8);
	System.out.println("A temperatura em Celsius é: " + c);
	
	if (c<15) {
		System.out.println("Frio");
	}else if (c>=22) {
		System.out.println("Calor");
	}else {
		System.out.println("Ameno");
		in.close();
	}
		
	}
}
