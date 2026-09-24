public class Conta {

    private int numero;
    private String titular;
    private double saldo;
    private Agencia agencia;

    public Conta(int numero, String titular, double saldo, Agencia agencia) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado!");
            System.out.println("Novo saldo: R$ " + saldo);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponível: R$ " + saldo);
    }

    public void mostrarDados() {
        agencia.mostrarDados();

        System.out.println("Número da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}