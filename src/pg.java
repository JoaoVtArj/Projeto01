import contra.emp;

import java.util.Locale;
import java.util.Scanner;

public class pg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        emp funcionario = new emp();

        System.out.print("Nome do Funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario Bruto: R$ ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: R$");
        funcionario.taxa = sc.nextDouble();
        System.out.println(funcionario);

        System.out.println("Acrescimo no Salario: ");
        double salario = sc.nextDouble();
        funcionario.acresSal(salario);
        System.out.print(funcionario);

        sc.close();
    }

}
