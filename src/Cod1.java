import estoq.dep;

import java.util.Locale;
import java.util.Scanner;

public class Cod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //inicio do codigo
        dep produto = new dep();
        System.out.println("Entrada de Produtos: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço : R$");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println("Produto Atual: "+produto);

        System.out.println("Entre com o adicional no estoque: ");
        int quantidade = sc.nextInt();
        produto.addProdutos(quantidade);
        System.out.println("Atualizaçao do estoque: " +produto);

        System.out.println("Retirar quantidade do estoque: ");
        quantidade = sc.nextInt();
        produto.removProdutos(quantidade);
        System.out.println("Atualizaçao do estoque: " +produto);



        sc.close();
    }
}
