public class PedidoLocal extends Pedido implements Pagamento {

    public PedidoLocal(int numero, String nomeCliente, double valor) {
        super(numero, nomeCliente, valor);
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