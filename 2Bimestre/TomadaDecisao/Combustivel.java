import java.util.Scanner;
public class Combustivel {
	public static void main (String args[]) {
	Scanner ler = new Scanner(System.in);
	double c, d, g;
	
	System.out.println("Escreva a dist�ncia percorrida em kil�metros:");
	d = ler.nextDouble();
	System.out.println("Escreva a capacidade do tanque em litros:");
	c = ler.nextDouble();
	g = d/c;
	if(g>=10/c){
		System.out.println( g + " = Econ�mico");
		} else {
			System.out.println( g + " = N�o econ�mico");
		}
	ler.close();
    }
}
