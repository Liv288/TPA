import java.util.Scanner;

public class Media {
   public static void main(String args[]) {
	  Scanner ler = new Scanner(System. in);
	   double b,l ;
	   int f, m, s, d;
	   
	   System.out.println("Digite a quantidade de convidadas femininas");
	   f = ler.nextInt();
	   
	   System.out.println("Digite a quantidade de convidados masculinos");
	   m = ler.nextInt();
	   
	     s=15*m+ 10*f;
	     d=6*m+8*f;
	     b=(100*(f+m))/1000;
	     l=(600*m+500*f)/1000;

	     System.out.println("A quantidade de salgados é: " + s);
	     System.out.println("A quantidade de doces é: " + d);
	     System.out.println("A quantidade de bolo é: " + b + "gr");
	     System.out.println("A quantidade de bebidas é: " + l + "ml");
	 
	     ler.close();
   }
}
