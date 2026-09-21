import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pedido pedido = null;

        int numero = 0;
        String nomeCliente = "";
        double valor = 0;

        double valorFinal = 0;

        while (true) {

            System.out.println("\n===== SISTEMA DE PEDIDOS =====");

            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Escolher pedido local ou delivery");
            System.out.println("3 - Mostrar dados do pedido");
            System.out.println("4 - Escolher forma de pagamento");
            System.out.println("5 - Pagar em dinheiro");
            System.out.println("6 - Pagar via PIX");
            System.out.println("7 - Pagar com cartão");
            System.out.println("8 - Encerrar");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Número do pedido:");
                    numero = sc.nextInt();

                    System.out.println("Nome do cliente:");
                    nomeCliente = sc.next();

                    System.out.println("Valor do pedido:");
                    valor = sc.nextDouble();

                    System.out.println("Dados cadastrados!");
                    break;

                case 2:
                    System.out.println("1 - Pedido local");
                    System.out.println("2 - Pedido delivery");
                    System.out.print("Escolha o tipo: ");

                    int tipo = sc.nextInt();

                    switch (tipo) {

                        case 1:

                            pedido = new PedidoLocal(
                                    numero,
                                    nomeCliente,
                                    valor
                            );

                            System.out.println("Pedido local cadastrado!");
                            break;

                        case 2:

                            System.out.println("Endereço:");
                            String endereco = sc.next();

                            System.out.println("Taxa de entrega:");
                            double taxaEntrega = sc.nextDouble();

                            pedido = new PedidoDelivery(
                                    numero,
                                    nomeCliente,
                                    valor,
                                    endereco,
                                    taxaEntrega
                            );

                            System.out.println("Pedido delivery cadastrado!");
                            break;

                        default:
                            System.out.println("Tipo inválido.");
                            break;
                    }

                    break;

                case 3:
                    if (pedido != null) {

                        System.out.println("\n===== DADOS DO PEDIDO =====");
                        System.out.println(pedido.exibirDados());

                    } else {
                        System.out.println("Nenhum pedido cadastrado.");
                    }

                    break;

                case 4:
                    System.out.println("1 - Dinheiro");
                    System.out.println("2 - PIX");
                    System.out.println("3 - Cartão");
                    System.out.print("Escolha a forma de pagamento: ");

                    int pagamento = sc.nextInt();

                    switch (pagamento) {

                        case 1:
                            System.out.println("Pagamento em dinheiro selecionado.");
                            break;

                        case 2:
                            System.out.println("Pagamento via PIX selecionado.");
                            break;

                        case 3:
                            System.out.println("Pagamento com cartão selecionado.");
                            break;

                        default:
                            System.out.println("Forma de pagamento inválida.");
                            break;
                    }

                    break;

                case 5:
                    if (pedido != null) {

                        if (pedido instanceof PedidoLocal) {

                            PedidoLocal local = (PedidoLocal) pedido;
                            valorFinal = local.pagar(pedido.getValor());

                        } else if (pedido instanceof PedidoDelivery) {

                            PedidoDelivery delivery =
                                    (PedidoDelivery) pedido;

                            valorFinal = delivery.pagar(pedido.getValor());
                        }

                        System.out.println("Pagamento em dinheiro realizado.");
                        System.out.println("Valor: R$ " + valorFinal);

                    } else {
                        System.out.println("Nenhum pedido cadastrado.");
                    }

                    break;

                case 6:
                    if (pedido != null) {

                        System.out.println("Informe a chave PIX:");
                        String chavePix = sc.next();

                        if (pedido instanceof PedidoLocal) {

                            PedidoLocal local = (PedidoLocal) pedido;
                            valorFinal = local.pagar(
                                    pedido.getValor(),
                                    chavePix
                            );

                        } else if (pedido instanceof PedidoDelivery) {

                            PedidoDelivery delivery =
                                    (PedidoDelivery) pedido;

                            valorFinal = delivery.pagar(
                                    pedido.getValor(),
                                    chavePix
                            );
                        }

                        System.out.println("Pagamento via PIX realizado.");
                        System.out.println("Valor: R$ " + valorFinal);

                    } else {
                        System.out.println("Nenhum pedido cadastrado.");
                    }

                    break;

                case 7:
                    if (pedido != null) {

                        System.out.println("Informe o número de parcelas:");
                        int parcelas = sc.nextInt();

                        if (pedido instanceof PedidoLocal) {

                            PedidoLocal local = (PedidoLocal) pedido;
                            valorFinal = local.pagar(
                                    pedido.getValor(),
                                    parcelas
                            );

                        } else if (pedido instanceof PedidoDelivery) {

                            PedidoDelivery delivery =
                                    (PedidoDelivery) pedido;

                            valorFinal = delivery.pagar(
                                    pedido.getValor(),
                                    parcelas
                            );
                        }

                        System.out.println("Pagamento com cartão realizado.");
                        System.out.println("Valor: R$ " + valorFinal);

                    } else {
                        System.out.println("Nenhum pedido cadastrado.");
                    }

                    break;

                case 8:
                    System.out.println("Programa encerrado.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}