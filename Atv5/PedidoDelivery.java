public class PedidoDelivery extends Pedido implements Pagamento {

    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numero, String nomeCliente, double valor,
                        String endereco, double taxaEntrega) {

        super(numero, nomeCliente, valor);

        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados()
                + " Endereço: " + endereco
                + " Taxa de entrega: R$ " + taxaEntrega;
    }

    @Override
    public double pagar(double valor) {
        return valor;
    }

    @Override
    public double pagar(double valor, String chavePix) {
        return valor;
    }

    @Override
    public double pagar(double valor, int parcelas) {
        return valor;
    }
}