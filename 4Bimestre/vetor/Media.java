import java.util.*;

public class Media {
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
		final int TAM=10;
		int a[], i, maior = 0;
		a= new int [TAM];
	
		for(i=0; i<TAM; i++) {
		System.out.println("Escreva o " + (i+1)+ "º valor desejado: ");
		a[i]=in.nextInt();
		
		if (a[i]>a[(i+1)]) {
			maior=a[i];
		}else {
			maior=a[(i+1)];
		}
			
		}
		System.out.println(maior);
		
	}
}
