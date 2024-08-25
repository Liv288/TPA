import java.util.Scanner;
public class Idade {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int at, n, idade;
		System.out.println("Escreva seu ano de nascimento:");
		n = ler.nextInt();
		System.out.println("Escreva o ano atual:");
		at = ler.nextInt();
		idade = at-n;
		if(idade<10) {
		System.out.println(idade + " = Criança");
		} else if(idade>=10 && idade<18) {
			System.out.println(idade + " = Adolescente");
		} else if(idade>=18 && idade<60) {
			System.out.println(idade + " = Adulto");
		  } else {
				System.out.println(idade + " = Idoso");
		  }
		 ler.close();
	}
      
}
