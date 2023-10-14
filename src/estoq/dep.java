package estoq;

public class dep {
    public String nome;
    public double preco;
    public int quantidade;

    public double valtotalnoEstoque() {
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removProdutos(int quantidade) {
        this.quantidade -= quantidade;

    }
    public String toString(){
        return nome
                + ", R$"
                + String.format("%.2f", preco)
                +", "
                + quantidade
                + " Unidades, Total: R$ "
                + String.format("%.2f", valtotalnoEstoque());
    }

}
