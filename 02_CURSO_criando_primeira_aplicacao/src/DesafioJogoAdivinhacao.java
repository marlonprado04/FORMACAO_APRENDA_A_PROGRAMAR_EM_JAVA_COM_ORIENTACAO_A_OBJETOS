import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroDaSorte = new Random().nextInt(100);
        int tentativas = 5;
        int chute = 0;

        while (tentativas != 0){
            System.out.println("Digite um número: ");
            chute = leitura.nextInt();

            if (chute > numeroDaSorte) {
                System.out.println("O número chutado foi MAIOR do que o número da sorte.");
            } else if (chute < numeroDaSorte) {
                System.out.println("O número chutado foi MENOR do que o número da sorte.");
            } else {
                System.out.println("Você acertou o número chutado com " + tentativas + " tentativas restantes!!");
                break;
            }

            tentativas--;

            if (tentativas == 0) {
                System.out.println("Você desperdiçou suas chances. O número sorteado era " + numeroDaSorte);
            } else {
                System.out.println("Restam " + tentativas + " tentativas.");
            }

        }
    }
}
