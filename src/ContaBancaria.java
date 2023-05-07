import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 1000;
        int opcaoDesejada = leitura.nextInt();

        System.out.println("""
            *****************************************************
            Bem Vindo!
            Cliente: Andrey Damasceno
            Conta: Corrente
            Saldo: R$ """ + saldo);
        System.out.println("""
            *****************************************************
            
            Transações:
            
            1 - Consultar saldo
            2 - Depósito
            3 - Transferência/Saque
            4 - Sair
            
            Digite a opção desejada:
            """);

        while (opcaoDesejada != 1 && opcaoDesejada != 2 && opcaoDesejada != 3 && opcaoDesejada != 4) {
            System.out.println("Opção inválida! Digite novamente");
            opcaoDesejada = leitura.nextInt();
        }

        while (opcaoDesejada == 1 || opcaoDesejada == 2 || opcaoDesejada == 3 || opcaoDesejada == 4) {

            if (opcaoDesejada == 1) {
                System.out.println("Seu saldo é de R$ " + saldo);
                System.out.println("Deseja realizar uma nova transação? S ou N");
                String novaTransacao = leitura.next();
                if (novaTransacao.equals("S")) {
                    System.out.println("Digite a opção desejada:");
                    opcaoDesejada = leitura.nextInt();
                    while (opcaoDesejada != 1 && opcaoDesejada != 2 && opcaoDesejada != 3 && opcaoDesejada != 4) {
                        System.out.println("Opção inválida! Digite novamente");
                        opcaoDesejada = leitura.nextInt();
                    }
                } else if (novaTransacao.equals("N")){
                    System.out.println("Até a próxima!");
                    break;
                }
            } else if (opcaoDesejada == 2) {
                System.out.println("Quanto deseja depositar?");
                double valorDoDeposito = leitura.nextDouble();
                saldo += valorDoDeposito;
                System.out.println("Operação realizada com sucesso! Seu novo saldo é de R$ " + saldo);
                System.out.println("Deseja realizar uma nova transação? S ou N");
                String novaTransacao = leitura.next();
                if (novaTransacao.equals("S")) {
                    System.out.println("Digite a opção desejada:");
                    opcaoDesejada = leitura.nextInt();
                    while (opcaoDesejada != 1 && opcaoDesejada != 2 && opcaoDesejada != 3 && opcaoDesejada != 4) {
                        System.out.println("Opção inválida! Digite novamente");
                        opcaoDesejada = leitura.nextInt();
                    }
                } else if (novaTransacao.equals("N")){
                    System.out.println("Até a próxima!");
                    break;
                }
            } else if (opcaoDesejada == 3) {
                System.out.println("Deseja sacar (1) ou transferir (2)?");
                int sacarOuTransferir = leitura.nextInt();
                if (sacarOuTransferir == 1) {
                    System.out.println("Qual o valor do saque?");
                    double valorSaque = leitura.nextDouble();
                    if (saldo > valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("operação realizada com sucesso! Seu novo saldo é de R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                        System.out.println("Seu saldo é de R$ " + saldo);
                    }
                } else if (sacarOuTransferir == 2) {
                    System.out.println("Qual o valor da transferência?");
                    double valorTransferencia = leitura.nextDouble();
                    if (saldo > valorTransferencia) {
                        saldo -= valorTransferencia;
                        System.out.println("Qual conta de destino?");
                        String contaDeDestino = leitura.next();
                        System.out.println("Qual banco de destino?");
                        String bancoDeDestino = leitura.next();
                        System.out.println("""
                        Operação realizada com sucesso! 
                        Você transferiu R$ """ + valorTransferencia);
                        System.out.println("Para a conta " + contaDeDestino + ", banco " + bancoDeDestino);
                        System.out.println("Seu novo saldo é de R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                        System.out.println("Seu saldo é de R$ " + saldo);
                    }
                }
                System.out.println("Deseja realizar uma nova transação? S ou N");
                String novaTransacao = leitura.next();
                if (novaTransacao.equals("S")) {
                    System.out.println("Digite a opção desejada:");
                    opcaoDesejada = leitura.nextInt();
                    while (opcaoDesejada != 1 && opcaoDesejada != 2 && opcaoDesejada != 3 && opcaoDesejada != 4) {
                        System.out.println("Opção inválida! Digite novamente");
                        opcaoDesejada = leitura.nextInt();
                    }
                } else if (novaTransacao.equals("N")){
                    System.out.println("Até a próxima!");
                    break;
                }
            } else if (opcaoDesejada == 4) {
                System.out.println("Até a próxima!");
                break;
            }
        }
    }
}
