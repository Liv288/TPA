import java.util.Scanner;
public class alunos {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int media, a, mb, b, r, i;
	        String opcao;

	        System.out.println("Escreva a quantidade de alunos que tirou mb:");
	        mb = in.nextInt();
	        
	        System.out.println("Escreva a quantidade de alunos que tirou b:");
	        b = in.nextInt();
	        
	        System.out.println("Escreva a quantidade de alunos que tirou r:");
	        r = in.nextInt();
	        
	        System.out.println("Escreva a quantidade de alunos que tirou i:");
	        i = in.nextInt();

	        a = mb + b + r + i;

	        System.out.println("Escolha a op��o:");
	        opcao = in.next();

	        switch (opcao) {
	            case "mb":
	                media = mb * 100 / a;
	                System.out.println("A m�dia �: " + media + "%");
	                break;
	            case "b":
	                media = b * 100 / a;
	                System.out.println("A m�dia �: " + media + "%");
	                break;
	            case "r":
	                media = r * 100 / a;
	                System.out.println("A m�dia �: " + media + "%");
	                break;
	            case "i":
	                media = i * 100 / a;
	                System.out.println("A m�dia �: " + media + "%");
	                break;
	            default:
	                System.out.println("Nota inv�lida");
	        }
	        in.close();
	    }
}
