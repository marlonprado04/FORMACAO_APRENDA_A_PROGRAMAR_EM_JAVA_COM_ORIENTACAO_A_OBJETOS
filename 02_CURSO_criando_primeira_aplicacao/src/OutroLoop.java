import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {
        // Criando scanner
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaDasNotas = 0;
        int totalDeNotas = 0;

        while(nota != -1){
            // Armazenando nota
            System.out.println("Digite uma nota ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaDasNotas += nota;
                totalDeNotas++;
            }

        }
        System.out.println("Média das notas: " + mediaDasNotas / totalDeNotas);

    }
}
