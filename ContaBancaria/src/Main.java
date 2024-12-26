import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente = "Gustavo Gomes Nogueira"; // variável que armazena o nome do cliente
        String tipoDeConta = "Corrente"; // variável que armazena o tipo de conta
        double saldo = 5000.00; // variável que armazena o saldo da conta
        double saldoTransferencia = 0; // variável que armazena o saldo que vai ser transferido
        double saldoRecebido = 0; // variável que armazena o saldo que vai ser recebido
        int opcao = 0; // variável que armazena as opções para a ultilização do menu
        boolean valorValido = false;

        System.out.println("==========================================");
        System.out.println("                  Dados                  \n");
        System.out.println("Nome do cliente: " + nomeCliente); // exibe o nome do cliente na tela
        System.out.println("Tipo da conta: " + tipoDeConta); // exibe o tipo da conta na tela
        System.out.println("Saldo da conta: R$" + saldo); // exibe o saldo da conta na tela
        System.out.println("==========================================\n");

        // menu de opções
        String menuDeopcoes = """  
                Opções:
                1-Consultar saldo da conta
                2-Transferir valor
                3-Receber valor
                4-Sair 
                """;

        while (opcao != 4) { // loop para exibir o menu enquanto a opção não for igual a 4
            System.out.println(menuDeopcoes);
            System.out.println("Digite a sua opção: ");
            opcao = scanner.nextInt(); // lê a opção digitada e armazena na variável

            if (opcao == 1) { // mostra o saldo da conta
                System.out.println("O saldo da conta atualmente é: R$" + saldo + "\n");
            } else if (opcao == 2) { // transfere valor
                valorValido = false;
                while (!valorValido) {
                    System.out.println("Digite o quanto você quer tranferir: ");
                    saldoTransferencia = scanner.nextDouble();

                    if (saldoTransferencia > saldo) {
                        System.out.println("Não é possivel realizar a tranferência");
                    } else if (saldoTransferencia == 0) {
                        System.out.println("Digite um valor válido para transferência");
                    } else {
                        saldo -= saldoTransferencia;
                        System.out.println("Tranferência realizada com sucesso!");
                        System.out.println("Saldo atual: R$" + saldo + "\n");
                        valorValido = true;
                    }

                }

            } else if (opcao == 3) { // recebe valor
                valorValido = false;
                while (!valorValido){
                    System.out.println("Digite o quanto você quer receber: ");
                    saldoRecebido = scanner.nextDouble();

                    if (saldoRecebido == 0 || saldoRecebido < 0){
                        System.out.println("Digite um valor válido para receber");
                    }else {
                        saldo += saldoRecebido;
                        System.out.println("Dinheiro recebido com sucesso!");
                        System.out.println("Saldo atual: R$" + saldo + "\n");
                        valorValido = true;
                    }
                }
            }

            }
        System.out.println("Obrigado, até mais!");

        }
    }

