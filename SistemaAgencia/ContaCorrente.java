public class ContaCorrente extends Conta implements Pagamento {

    public ContaCorrente(int numero, String titular, double saldo, Agencia agencia) {

        super(numero, titular, saldo, agencia);

    }

    @Override
    public void pagar(double valor) {

        if (valor > 0 && valor <= getSaldo()) {

            setSaldo(getSaldo() - valor);

            System.out.println("Pagamento realizado.");
            System.out.println("Saldo atualizado: R$ " + getSaldo());

        } else {

            System.out.println("Pagamento não realizado.");

        }
    }

    public void pagar(double valor, String chavePix) {

        if (valor > 0 && valor <= getSaldo()) {

            setSaldo(getSaldo() - valor);

            System.out.println("Pagamento via PIX realizado.");
            System.out.println("Chave PIX: " + chavePix);
            System.out.println("Saldo atualizado: R$ " + getSaldo());

        } else {

            System.out.println("Pagamento não realizado.");

        }
    }

    public void pagar(double valor, int parcelas) {

        if (valor > 0 && parcelas > 0 && valor <= getSaldo()) {

            double valorParcela = valor / parcelas;

            setSaldo(getSaldo() - valor);

            System.out.println("Pagamento com cartão realizado.");
            System.out.println("Valor de cada parcela: R$ " + valorParcela);
            System.out.println("Saldo atualizado: R$ " + getSaldo());

        } else {

            System.out.println("Pagamento não realizado.");

        }
    }

    public void transferir(double valor, ContaCorrente contaDestino) {

        if (valor <= 0) {

            System.out.println("O valor da transferência deve ser maior que zero.");
            return;
        }

        if (valor > getSaldo()) {

            System.out.println("Saldo insuficiente para realizar a transferência.");
            return;
        }

        setSaldo(getSaldo() - valor);

        contaDestino.setSaldo(contaDestino.getSaldo() + valor);

        System.out.println("Transferência realizada com sucesso!");
        System.out.println("Valor transferido: R$ " + valor);
        System.out.println("Saldo atualizado: R$ " + getSaldo());
    }
}