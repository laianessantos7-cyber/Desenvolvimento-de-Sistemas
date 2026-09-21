public interface Pagamento {

    double pagar(double valor);

    double pagar(double valor, String chavePix);

    double pagar(double valor, int parcelas);

}