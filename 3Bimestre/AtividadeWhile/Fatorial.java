import java.util.Scanner;
public class Fatorial{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, n, r=1;
		
		System.out.println("Escreva o n�mero inteiro que voc� desejar");
		n = in.nextInt();
		
		while(i<=n){
			r=r*i;
			i++;
			
		}System.out.println("A fatora��o de " +n+ " � igual a " +r);
	
		in.close();
		}
}