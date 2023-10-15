import ATM.atm24;

import java.util.Locale;
import java.util.Scanner;

public class ClientATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        atm24 atm24;

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.println("Nome da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Vai fazer um deposito inicial s/n? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Digite o valor: ");
            double saldoInicial = sc.nextDouble();
            atm24 = new atm24(numero, nome, saldoInicial);
        } else {
            atm24 = new atm24(numero, nome);
        }
        System.out.println();
        System.out.println("Atualizaçao da conta");
        System.out.println(atm24);

        System.out.println();
        System.out.println("Entre com valor de deposito");
        double valorDeposito = sc.nextDouble();
        atm24.deposito(valorDeposito);
        System.out.println("Atualizaçao da conta");
        System.out.print(atm24);

        System.out.println();
        System.out.println("Entre com valor do saque");
        double valorSaque = sc.nextDouble();
        atm24.saque(valorSaque);
        System.out.println("Atualizaçao da conta");
        System.out.print(atm24);

    }
}
