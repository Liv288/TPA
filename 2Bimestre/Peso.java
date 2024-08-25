import java.util.Scanner; 
public class Peso {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double p, a, imc;
		
		System.out.println("Escreva seu peso");
		p = ler.nextDouble();
		System.out.println("Escreva sua altura");
		a = ler.nextDouble();
		imc = p/(a*a);
		if (imc<18.5) {
		System.out.println(imc + " = Excesso de magreza");
		}else if(imc>=18.5 && imc<25) {
			System.out.println(imc + " = Peso normal");
		}else if(imc>=25 && imc<30) {
			System.out.println(imc +" = Excesso de peso");
		}else if(imc>=30 && imc<35) {
			System.out.println(imc +" = Obesidade (Grau 1)");
		}else if(imc>=35 && imc<40) {
			System.out.println(imc + " = Obesidade (Grau 2)");
		} else {
			System.out.println(imc + " = Obesidade (Grau 3)");
		}
		ler.close();
	}

}
