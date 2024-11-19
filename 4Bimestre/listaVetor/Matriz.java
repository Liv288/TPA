import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i, j, soma=0;
		a = new int [TAM];
		b = new int [TAM];
		
		for(j=0; j<TAM; j++) {
			System.out.print("Digite a " + (j+1) + "º posição do vetor A: ");
			a[j] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			soma=0;
			for(j=i; j<TAM; j++) {
				soma+=a[j];
			}
			b[i]=soma;
			System.out.println("b[" + (i+1) + "]= " + b[i]);
		}
		
		in.close();
	}
}
