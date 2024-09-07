import java.util.Scanner;

public class Primo {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i=0, d=2;
		
		  System.out.println("Escreva um número inteiro para descobir se ele é primo ou não");
		  n = in.nextInt();
		  
		  if (n<2) {
			  System.out.println(n+" é primo");
		  }else {
			 while(d<n){
				 if (n%d==0) {
	                    i=i+1;
	                }
	                d++;
	            }
			 if (i==0) {
				 System.out.println(n+" é primo");
			 }else {
				 System.out.println(n+" não é primo");
			 }
			 
		   }in.close();
	}
}