public class ProdutoDigital extends Produto implements Venda {

    public ProdutoDigital(int codigo, String nome, double preco) {

        super(codigo, nome, preco);

    }

    @Override
    public double realizarVenda(int quantidade) {

        return getPreco() * quantidade;

    }

    public double realizarVenda(int quantidade, double desconto) {

        double valor = getPreco() * quantidade;

        return valor - (valor * desconto / 100);

    }

}