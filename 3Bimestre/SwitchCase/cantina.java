import java.util.Scanner;
public class cantina {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod;

        System.out.println("Digite o c�digo:");
        cod = in.nextInt();

        switch(cod) {
            case 1:
                System.out.println("Cachorro-quente - pre�o: R$8,00");
                break;
            case 2:
                System.out.println("Cheeseburguer - pre�o: R$12,00");
                break;
            case 3:
                System.out.println("X-Salada - pre�o: R$15,00");
                break;
            case 4:
                System.out.println("Misto Quente - pre�o: R$11,00");
                break;
            case 5:
                System.out.println("P�o na chapa - pre�o: R$6,00");
                break;
            default:
                System.out.println("C�digo inv�lido");
        }
        in.close();
    }
}
