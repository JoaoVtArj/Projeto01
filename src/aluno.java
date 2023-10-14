import not.notas;

import java.util.Locale;
import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        notas nt = new notas();

        System.out.print("Nome do Aluno: ");
        nt.nome = sc.nextLine();
        System.out.println("Notas: ");
        nt.nota1 = sc.nextDouble();
        nt.nota2 = sc.nextDouble();
        nt.nota3 = sc.nextDouble();

        System.out.printf("Nota Final = %.2f%n", nt.notFinal());

        if(nt.notFinal() < 60){
            System.out.println("Reprovado");
            System.out.printf("Faltam : %.2f Pontos%n", nt.faltnotas());
        }
        else{
            System.out.println("Aprovado!");
        }
        sc.close();
    }
}
