package listaComplementar;
import java.util.Scanner;
public class Parede {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		double c, l,p;
		
		System.out.println("Digite o comprimento da parede");
		c = in.nextDouble();
		
		System.out.println("Digite a largura da parede");
		l = in.nextDouble();
		
		p = (c*l)/3.8;
		
		System.out.println("Serão necessárias " + p + " latas de tinta");
		in.close();
		}
}
