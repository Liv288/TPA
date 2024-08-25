import java.util.Scanner;
public class Combustivel {
	public static void main (String args[]) {
	Scanner ler = new Scanner(System.in);
	double c, d, g;
	
	System.out.println("Escreva a distância percorrida em kilômetros:");
	d = ler.nextDouble();
	System.out.println("Escreva a capacidade do tanque em litros:");
	c = ler.nextDouble();
	g = d/c;
	if(g>=10/c){
		System.out.println( g + " = Econômico");
		} else {
			System.out.println( g + " = Não econômico");
		}
	ler.close();
    }
}
