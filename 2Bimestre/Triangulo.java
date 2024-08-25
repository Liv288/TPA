import java.util.Scanner;
public class Triangulo {
	    public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		System.out.println("Escreva a medida do primeiro lado:");
		a = ler.nextDouble();
		System.out.println("Escreva a medida do segundo lado:");
		b = ler.nextDouble();
		System.out.println("Escreva a medida do terceiro lado:");
		c = ler.nextDouble();
		if(a==b && b==c && c==a && a==c && b==a && c==b) {
			System.out.println("Triângulo Equilátero");
			} else if(a==b || b==c || c==a || a==c || b==a || c==b) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		ler.close();
	    }
}
