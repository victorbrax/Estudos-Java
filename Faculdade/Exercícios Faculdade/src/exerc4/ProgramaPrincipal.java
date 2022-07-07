package exerc4;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Banco banco = new Banco();
        ContaPoupanca c1 = new ContaPoupanca();
        ContaInvestimento c2 = new ContaInvestimento();
        Scanner input = new Scanner(System.in);

        System.out.println("================== Banco FATEK-DINDIN ==================");
        // Área de Cadastro
        System.out.println("Digite seu nome:");
        System.out.print(" > ");
        banco.setNome(input.nextLine());
        System.out.println("Digite seu CPF:");
        System.out.print(" > ");
        banco.setCpf(input.nextInt());
        System.out.println("Digite sua idade:");
        System.out.print(" > ");
        banco.setIdade(input.nextInt());

        banco.menuConta();
        int typecon = input.nextInt();
        switch (typecon) {
            case 1 -> c1.setTipo(1);
            case 2 -> c2.setTipo(2);
            default -> System.out.println("Escolha incorreta.");
        }

        boolean encerra = true;
        while (encerra) {

            int typeop; // Boss Operation
            int optstatus; // Select option Status

            // Operações de Conta Poupança
            if (typecon == 1) {
                banco.menuOperacao();
                typeop = input.nextInt();
                if (typeop == 1) {
                    System.out.println("Digite o valor a ser sacado: ");
                    System.out.print("> ");
                    c1.Sacar(input.nextFloat());
                } else if (typeop == 2) {
                    System.out.println("Digite o valor a ser depositado: ");
                    System.out.print("> ");
                    c1.depositar(input.nextFloat());
                } else if (typeop == 3) {
                    System.exit(0);
                }
            }

            // Operações de Conta Investimento
            else if (typecon == 2) {
                banco.menuOperacao();
                typeop = input.nextInt();

                if (typeop == 1) {
                    System.out.println("Digite o valor a ser sacado: ");
                    System.out.print("> ");
                    c2.Sacar(input.nextFloat());
                } else if (typeop == 2) {
                    System.out.println("Digite o valor a ser depositado: ");
                    System.out.print("> ");
                    c2.depositar(input.nextFloat());
                } else if (typeop == 3) {
                    System.exit(0);
                }
            }

            System.out.println();
            System.out.println("Deseja ver seu Status?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não [Encerrar aplicativo]");
            System.out.print("> ");
            optstatus = input.nextInt();

            // Mostra Status
            if (optstatus == 1) {
                if (typecon == 1) {
                    banco.status();
                    c1.status();
                } else if (typecon == 2) {
                    banco.status();
                    c2.status();
                }
            } else if (optstatus == 2) {
                encerra = false;
                System.out.println("O FATEK-DINDIN agradece sua preferência! :)");
            }
        }
    }
}



