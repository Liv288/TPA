import java.util.Scanner;
public class agenciaViagem {
	public static void main (String arg[]) {
		Scanner in = new Scanner(System.in);
		int destino, dia, valor;
		
		 System.out.println("Escreva 1 se sua viagem for para Ilha Bela, caso for para Fernando de Noronha escreva 2");
		 destino = in.nextInt();
		 System.out.println("Escreva a quantidade de dias que vc� deseja ficar");
		 dia = in.nextInt();
		 if (destino==1 && dia<=5) {
			 valor=dia*240;
			 System.out.println("Voc� ir� gastar "+valor+" reais"); 
		 }else if (destino==1 && dia>=6 && dia<=10){
			 valor=dia*220+130;
			 System.out.println("Voc� ir� gastar "+valor+" reais"); 
		 }else if (destino==1 && dia>10) {
			 valor=dia*210+150;
			 System.out.println("Voc� ir� gastar "+valor+" reais"); 
		 }if (destino==2 && dia<=5) {
			 valor=dia*400+100;
		     System.out.println("Voc� ir� gastar "+valor+" reais"); 
		     }else if (destino==2 && dia>=6 && dia<=10){
			     valor=dia*410+150;
			     System.out.println("Voc� ir� gastar "+valor+" reais"); 
		     }else if (destino==2 && dia>10) {
			     valor=dia*420+200;
			     System.out.println("Voc� ir� gastar "+valor+" reais"); 
		     }else if (destino>2){
			  System.out.println("Esse local n�o � v�lido");
	      }
		 in.close();
	}
}