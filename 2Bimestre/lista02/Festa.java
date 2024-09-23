package listaComplementar;
import java.util.Scanner;
public class Festa {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		double b, l;
		int f, m, s, d;
		
		System.out.println("Escreva a quantidade de convidados femeninos");
		f = in.nextInt();
		
		System.out.println("Escreva a quantidade de convidados masculinos");
		m = in.nextInt();
		
		s = 15*m+10*f;
		d = 6*m+8*f;
		b = (100*(f+m))/1000;
		l = (600*m+500*f)/1000;
		
		System.out.println("A qauntidade de salgados é: " + s);
		System.out.println("A qauntidade de doces é: " + d);
		System.out.println("A qauntidade de bolo é: " + b + "g");
		System.out.println("A qauntidade de bebida é: " + l + "ml");
		
		in.close();
	}
}
