public class ProdutoFisico extends Produto implements Venda {

    private double frete;

    public ProdutoFisico(int codigo, String nome, double preco, double frete) {

        super(codigo, nome, preco);

        this.frete = frete;

    }

    public double getFrete() {

        return frete;

    }

    public void setFrete(double frete) {

        this.frete = frete;

    }

    @Override
    public double realizarVenda(int quantidade) {

        return (getPreco() * quantidade) + frete;

    }

    public double realizarVenda(int quantidade, double desconto) {

        double valor = (getPreco() * quantidade) + frete;

        return valor - (valor * desconto / 100);

    }

}