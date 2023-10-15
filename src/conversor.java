import Conversion.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        CurrencyConverter conv = new CurrencyConverter();

        System.out.print("Qual Valor do Dollar? ");
        conv.dollar = sc.nextDouble();
        System.out.print("Quantos dolares quer comprar ? ");
        conv.reais = sc.nextDouble();
        System.out.println(conv);

        sc.close();
    }
}
