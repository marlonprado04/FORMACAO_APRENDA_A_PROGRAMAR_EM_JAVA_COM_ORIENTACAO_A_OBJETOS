import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        // Criando scanner
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaDasNotas =0;

        // Criando for
        for (int i = 0; i < 3; i++) {
            // Armazenando nota
            System.out.println("Digite uma nota: ");
            nota = leitura.nextDouble();
            mediaDasNotas += nota;
        }

        System.out.println("Média das notas: " + mediaDasNotas / 3);

    }
}
