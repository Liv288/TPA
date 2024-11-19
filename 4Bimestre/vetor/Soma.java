import java.util.Scanner;
public class Soma{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			final int TAM = 10;
			int a[], b[], c[], i;
			a = new int [TAM];
			b = new int [TAM];
			c = new int [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.println("Escreva o valor da " + (i+1) + " posição do vetor A");
				a[i] = in.nextInt();
			}
			
			for(i=0; i<TAM; i++) {
				System.out.println("Escreva o valor da " + (i+1) + " posição do vetor B");
				b[i] = in.nextInt();
			}
			System.out.print("\nA = [");
			for(i=0; i<TAM; i++) {
				
				if(i==9) {
					System.out.print(a[i]);
				}else
				System.out.print(a[i]+" ");
			}
			System.out.print("]");
			
			System.out.print("\nB = [");
			for(i=0; i<TAM; i++) {
				
				if(i==9) {
					System.out.print(b[i]);
				}else
				System.out.print(b[i]+" ");
			}
			System.out.print("]");
			
			System.out.print("\nC = [");
			for(i=0; i<TAM; i++) {
				c[i]= a[i]+b[i];
				
				if(i==9) {
					System.out.print(c[i]);
				}else
				System.out.print(c[i]+" ");
			}
			System.out.print("]");
			in.close();
	}
	
}