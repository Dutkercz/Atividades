import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 2500.00;
        double dep = 0;
        System.out.println("Digite seu nome completo:");
        String name = scan.nextLine();
        System.out.println("****************************************");
        System.out.println("Bem vindo ao Banco City:");
        System.out.printf("Nome: \t\t\t\t%s" +
                "\nTipo de Conta: \t\tCorrente" +
                "\nSaldo: \t\t\t\tR$ %.2f", name, saldo);
        System.out.println("\n****************************************");
        int escolha = 0;
        while (true){
            System.out.println("\n=== Escolha uma das opções do menu ===" +
                    "\n1 - SALDO" +
                    "\n2 - DEPOSITO" +
                    "\n3 - SAQUE/PIX" +
                    "\n4 - SAIR");
            escolha = scan.nextInt();
            System.out.println();
            if (escolha == 1){
                System.out.printf("Seu saldo é R$ %.2f", saldo);
            } else if (escolha == 2) {
                System.out.println("Quanto você quer depoistar:");
                dep = scan.nextDouble();
                if (dep == 0){
                    System.out.println("Não é possivel deposistar R$ 0,00");
                }else {
                    saldo+=dep;
                    System.out.printf("Saldo atualizado: R$ %.2f", saldo);
                }
            } else if (escolha==3) {
                System.out.println("Quanto deseja sacar ou enviar:");
                double saq = scan.nextDouble();
                if (saq > saldo){
                    System.out.printf("Saldo insuficiente, seu saldo atual é R$ %.2f", saldo);
                } else if (saq<=saldo) {
                    System.out.printf("O valor de R$ %.2f foi enviado/sacado com sucesso.",saq);
                    saldo-=saq;
                    System.out.println();
                    System.out.printf("Saldo atualizado: R$ %.2f", saldo);
                }
            } else if (escolha == 4) {
                System.out.println("Ecerrando o caixa eletronico." +
                        "\nOBRIGADO, VOLTE SEMPRE.");
                break;
            }else {
                System.out.println("ESCOLHA INVALIDA.");
            }
        }
    }
}
