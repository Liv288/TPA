import java.util.Scanner;
public class escolaFutebol {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int idade;

	        System.out.println("Digite a sua idade:");
	        idade = in.nextInt();

	        switch(idade) {
	            case 6:
	                System.out.println("Dente de leite");
	                break;
	            case 7:
	                System.out.println("J�nior");
	                break;
	            case 8:
	                System.out.println("J�nior Max");
	                break;
	            case 9:
	                System.out.println("J�nior Master");
	                break;
	            case 10:
	                System.out.println("Master");
	                break;
	            default:
	                System.out.println("Voc� ainda � muito novo");
	        }
	        in.close();
	    }
}
