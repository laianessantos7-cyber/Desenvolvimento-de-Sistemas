import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroAgencia;
        String nomeAgencia;
        int numeroConta;
        String titular;
        double saldoInicial;

        System.out.println("========== CADASTRO INICIAL ==========");

        System.out.println("Número da agência: ");
        numeroAgencia = sc.nextInt();

        sc.nextLine();

        System.out.println("Nome da agência: ");
        nomeAgencia = sc.nextLine();

        System.out.println("Número da conta: ");
        numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Titular: ");
        titular = sc.nextLine();

        System.out.println("Saldo inicial: ");
        saldoInicial = sc.nextDouble();

        Agencia agencia = new Agencia(numeroAgencia, nomeAgencia);

        ContaCorrente conta = new ContaCorrente(
                numeroConta,
                titular,
                saldoInicial,
                agencia
        );

        ContaCorrente contaDestino = new ContaCorrente(
                2000,
                "Conta Destino",
                500.00,
                agencia
        );

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("7 - Transferir");
            System.out.println("0 - Sair");
            System.out.println("==========================");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    conta.mostrarDados();
                    break;

                case 2:
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();

                    conta.depositar(deposito);
                    break;

                case 4:
                    System.out.println("Digite o valor do pagamento: ");
                    double valorPix = sc.nextDouble();

                    sc.nextLine();

                    System.out.println("Digite a chave PIX: ");
                    String chavePix = sc.nextLine();

                    conta.pagar(valorPix, chavePix);
                    break;

                case 5:
                    System.out.println("Digite o valor da compra: ");
                    double valorCartao = sc.nextDouble();

                    System.out.println("Digite a quantidade de parcelas: ");
                    int parcelas = sc.nextInt();

                    conta.pagar(valorCartao, parcelas);
                    break;

                case 6:
                    System.out.println("Digite o valor do pagamento: ");
                    double valorDinheiro = sc.nextDouble();

                    conta.pagar(valorDinheiro);
                    break;

                case 7:
                    System.out.println("Número da conta de destino: ");
                    int numeroDestino = sc.nextInt();

                    if (numeroDestino == contaDestino.getNumero()) {

                        System.out.println("Digite o valor da transferência: ");
                        double valorTransferencia = sc.nextDouble();

                        conta.transferir(valorTransferencia, contaDestino);

                    } else {

                        System.out.println("Conta de destino não encontrada.");

                    }

                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }
}