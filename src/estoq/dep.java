package estoq;

public class dep {

    private String nome;
    private double preco;
    private int quantidade;

    public dep(String nome) {
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public double valtotalnoEstoque() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removProdutos(int quantidade) {
        this.quantidade -= quantidade;

    }

    public String toString() {
        return nome
                + ", R$"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " Unidades, Total: R$ "
                + String.format("%.2f", valtotalnoEstoque());
    }

}
