import java.util.Scanner; 

public class Tabuada {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			final int TAM=5;
			int a[], i, resul, cont;
			a = new int [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
				a[i] = in.nextInt();
			}
			
			i=0;
			
			while(i<TAM) {
				for(cont=1; cont<11; cont++) {
					resul=a[i]*cont;
					System.out.println(a[i] + "x" + cont + "= " + resul);
				}
				System.out.println(" ");
				i++;
			} 
			
			in.close();

		}
}
