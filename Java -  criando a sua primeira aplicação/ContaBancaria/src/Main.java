import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Pedro Barros";
        String tipoConta = "Corrente";
        double saldoConta = 2500;

        Scanner entrada = new Scanner(System.in);
        int escolha = 0;

        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println(String.format("Nome: %s", nomeCliente));
        System.out.println(String.format("Tipo conta: %s", tipoConta));
        System.out.println(String.format("Saldo: R$%.2f", saldoConta));
        System.out.println("******************************");

        while (escolha != 4) {
            System.out.println("");
            System.out.println("Operações\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("\nDigite a opção desejada:");
            escolha = entrada.nextInt();

            switch (escolha){
                case 1:
                    System.out.println(String.format("O saldo atual é R$%.2f", saldoConta));
                    break;
                case 2:
                    System.out.println("Informe o valor a ser recebido:");
                    double valorRecebido = entrada.nextDouble();
                    if(valorRecebido < 0) {
                        System.out.println("Erro: o valor inserido não é válido para esta operação.");
                        break;
                    } else {
                        saldoConta += valorRecebido;
                        System.out.println(String.format("\nSaldo atualizado: R$%.2f", saldoConta));
                        break;
                    }
                case 3:
                    System.out.println("Informe o valor a ser transferido:");
                    double valorTransferido = entrada.nextDouble();
                    if (valorTransferido > saldoConta) {
                        System.out.println("Erro: não há saldo suficiente para realizar esta transferência.");
                        break;
                    } else if (valorTransferido < 0) {
                        System.out.println("Erro: o valor inserido não é válido para esta operação.");
                        break;
                    } else {
                        saldoConta -= valorTransferido;
                        System.out.println(String.format("\nSaldo atualizado: R$%.2f", saldoConta));
                        break;
                    }
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}