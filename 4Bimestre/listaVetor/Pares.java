import java.util.Scanner;
public class Pares {
	public static  void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		final int TAM=10;
		int a[], i, j;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
			a[i] = in.nextInt();
		}
		
		System.out.print("Digite a posição que você deseja ver os pares: ");
		j=in.nextInt();
		
		for(i=0; i<j; i++) {
			if(a[i]%2==0) {
				System.out.print(a[i] + " ");
			}
		}
		in.close();
	}
}
