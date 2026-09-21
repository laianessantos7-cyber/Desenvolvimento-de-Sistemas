public class Pedido {

    private int numero;
    private String nomeCliente;
    private double valor;

    public Pedido(int numero, String nomeCliente, double valor) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String exibirDados() {
        return "Número do pedido: " + numero
                + " Nome do cliente: " + nomeCliente
                + " Valor: R$ " + valor;
    }
}