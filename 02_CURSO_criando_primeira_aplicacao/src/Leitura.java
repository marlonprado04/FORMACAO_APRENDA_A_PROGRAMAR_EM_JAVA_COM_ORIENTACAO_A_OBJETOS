import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // Criando scanner
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        // Armazenando leitura do terminal em variável
        String filme = leitura.nextLine();

        System.out.println("Agora digite o ano de lançamento: ");
        // Armazenando um int
        int anoDeLancamento = leitura.nextInt();

        // Armazenando double
        System.out.println("Digite sua nota: ");
        double nota = leitura.nextDouble();

        System.out.println("Filme: " + filme + " Ano: " + anoDeLancamento + " Nota: " + nota);
    }

}
