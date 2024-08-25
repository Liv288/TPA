import java.util.Scanner;
public class taxi {
	public static void main (String arg[]) {
		Scanner in = new Scanner(System.in);
		double distancia, hora, bagagem, tarifa;
		
		System.out.println("Escreva a distância percorrida");
		distancia = in.nextDouble();
		System.out.println("Escreva a hora da viagem");
		hora = in.nextDouble();
		System.out.println("Escreva a quantidade de bagagens");
		bagagem = in.nextDouble();
		if (hora>6 && hora<20) {
			tarifa=distancia*2.75+4.50+(bagagem*2.75);
			System.out.println("Sua viagem ficará" +tarifa+ "reais");
		}else {
			tarifa=distancia*3.58+5.65+(bagagem*2.75);
			System.out.printf("Sua viagem ficará %.2f \n",tarifa,"reais %.2f \n");
		}
		in.close();
	}
		
}
