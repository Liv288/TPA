import java.util.*;

public class Inverso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			final int TAM=10;
			int a[], b[], i;
			a= new int [TAM];
			b= new int [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.println("Escreva a "+ (i+1) +"º posição do vetor A: ");
				a[i]= in.nextInt();
			}
			System.out.print("\nA= [");
			for(i=0; i<TAM; i++) {
				if(i==9) {
					System.out.print(a[i]);
				}else {
					System.out.print(a[i] + " ");
				}
			}
			System.out.print("]");
			
			System.out.print("\nB= [");
			for(i=9; i>=0; i=i-1) {
				b[i]=a[i];
				
				if(i==0) {
					System.out.print(b[i]);
				}else {
					System.out.print(b[i] + " ");
				}
			}
			System.out.print("]");
			in.close();
	}
}
