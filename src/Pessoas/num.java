package Pessoas;
import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ps[] ps = new ps[n];


        for (int i=0;i<n;i++){
            ps[i] = new ps(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        double alturaMd = 0;
        for (ps pessoa : ps){
            alturaMd += pessoa.getAltura();
        }
        alturaMd /= n;

        int qtdMenor = 0;
        for (ps pessoa : ps){
            if (pessoa.getIdade() < 16); {
                qtdMenor++;
            }
        }
        double pormen = (double) qtdMenor / n * 100;

        System.out.println("Altura Media: "+alturaMd);
        System.out.println("Porcentagem menores de 16 anos: "+pormen);

        if(qtdMenor >0){
            System.out.println("Menores de 16 anos: ");
            for (ps pessoa : ps){
                if (pessoa.getIdade() < 16){
                    System.out.println("* "+pessoa.getNome());
                }
            }
        }

    }
}
