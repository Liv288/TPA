import java.util.Scanner;
public class Quadrado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o valor da " + (i+1) + "º posição");
			a[i] = in.nextInt();
		}
		
		System.out.print("\nB = [");
		for(i=0; i<TAM; i++) {
			b[i]=a[i]*a[i];
			
			if(i==9) {
				System.out.print(b[i]);
			}else
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		in.close();
	}

}
