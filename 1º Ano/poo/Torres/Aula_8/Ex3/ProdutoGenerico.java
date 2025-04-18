package Aula_8.Ex3;

public class ProdutoGenerico extends Produtos implements Produto {

    public ProdutoGenerico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public String toString() {
        return "Produto genérico : " + "nome = " + getNome() + ", preco = " + getPreco() + ", quantidade = "
                + getQuantidade() + ".\n";
    }
}
