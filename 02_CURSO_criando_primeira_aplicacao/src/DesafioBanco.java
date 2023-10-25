import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        // Declarando variáveis globais
        Scanner leitura = new Scanner(System.in);
        String nome = "";
        String tipoDeConta = "";
        double saldo = 0;
        int opcao = 0;

        // Recebendo e imprimindo informações iniciais do cliente
        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite o tipo de conta: ");
        tipoDeConta =  leitura.nextLine();

        System.out.println("Digite o saldo inicial: ");
        saldo = leitura.nextDouble();

        // Imprimindo dados iniciais do cliente
        System.out.println("---------------------------");
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("***********************");

        System.out.println();
        while(opcao != 5){
            System.out.println("Operações disponíveis");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println();

            double valorTransferido = 0;

            System.out.println("Digite a opção desejada");
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O saldo atual é: " + saldo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    valorTransferido = leitura.nextDouble();
                    saldo += valorTransferido;
                    System.out.println("O saldo atual é: " + saldo);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    valorTransferido = leitura.nextDouble();
                    if (valorTransferido > saldo){
                        System.out.println("Não consigo fazer esta operação.");
                    }else {
                        saldo -= valorTransferido;
                    }
                    System.out.println("O saldo atual é: " + saldo);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Saindo do sistema");
                    opcao = 5;
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção inválida. Digite novamente.");
                    System.out.println();

            }

        }


    }
}
