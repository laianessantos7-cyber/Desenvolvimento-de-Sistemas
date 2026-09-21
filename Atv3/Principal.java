import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto produto = null;

        int codigo = 0;
        String nome = "";
        double preco = 0;
        double frete = 0;
        int quantidade = 0;
        double valorFinal = 0;

        while (true) {

            System.out.println("\n===== SISTEMA DE PRODUTOS =====");

            System.out.println("1 - Cadastrar produto.");
            System.out.println("2 - Escolher produto físico ou digital.");
            System.out.println("3 - Mostrar dados do produto.");
            System.out.println("4 - Informar quantidade.");
            System.out.println("5 - Realizar venda.");
            System.out.println("6 - Realizar venda com desconto.");
            System.out.println("7 - Mostrar valor final.");
            System.out.println("8 - Sair.");

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Código:");

                    codigo = sc.nextInt();

                    System.out.println("Nome:");

                    nome = sc.next();

                    System.out.println("Preço:");

                    preco = sc.nextDouble();

                    System.out.println("Dados cadastrados!");

                    break;

                case 2:

                    System.out.println("1 - Produto físico");
                    System.out.println("2 - Produto digital");

                    System.out.println("Escolha o tipo:");

                    int tipo = sc.nextInt();

                    switch (tipo) {

                        case 1:

                            System.out.println("Valor do frete:");

                            frete = sc.nextDouble();

                            produto = new ProdutoFisico(
                                    codigo,
                                    nome,
                                    preco,
                                    frete
                            );

                            System.out.println("Produto físico cadastrado!");

                            break;

                        case 2:

                            produto = new ProdutoDigital(
                                    codigo,
                                    nome,
                                    preco
                            );

                            System.out.println("Produto digital cadastrado!");

                            break;

                        default:

                            System.out.println("Tipo inválido.");

                            break;
                    }

                    break;

                case 3:

                    if (produto != null) {

                        System.out.println("\n===== DADOS DO PRODUTO =====");

                        System.out.println(produto.exibirDados());

                    } else {

                        System.out.println("Nenhum produto cadastrado.");

                    }

                    break;

                case 4:

                    if (produto != null) {

                        System.out.println("Informe a quantidade:");

                        quantidade = sc.nextInt();

                        System.out.println("Quantidade informada!");

                    } else {

                        System.out.println("Nenhum produto cadastrado.");

                    }

                    break;

                case 5:

                    if (produto != null) {

                        if (produto instanceof ProdutoFisico) {

                            ProdutoFisico produtoFisico =
                                    (ProdutoFisico) produto;

                            valorFinal =
                                    produtoFisico.realizarVenda(quantidade);

                        } else if (produto instanceof ProdutoDigital) {

                            ProdutoDigital produtoDigital =
                                    (ProdutoDigital) produto;

                            valorFinal =
                                    produtoDigital.realizarVenda(quantidade);

                        }

                        System.out.println(
                                "Valor da venda: R$ " + valorFinal
                        );

                    } else {

                        System.out.println("Nenhum produto cadastrado.");

                    }

                    break;

                case 6:

                    if (produto != null) {

                        System.out.println("Informe o desconto (%):");

                        double desconto = sc.nextDouble();

                        if (produto instanceof ProdutoFisico) {

                            ProdutoFisico produtoFisico =
                                    (ProdutoFisico) produto;

                            valorFinal =
                                    produtoFisico.realizarVenda(
                                            quantidade,
                                            desconto
                                    );

                        } else if (produto instanceof ProdutoDigital) {

                            ProdutoDigital produtoDigital =
                                    (ProdutoDigital) produto;

                            valorFinal =
                                    produtoDigital.realizarVenda(
                                            quantidade,
                                            desconto
                                    );

                        }

                        System.out.println(
                                "Valor da venda com desconto: R$ "
                                + valorFinal
                        );

                    } else {

                        System.out.println("Nenhum produto cadastrado.");

                    }

                    break;

                case 7:

                    if (produto != null) {

                        System.out.println(
                                "Valor final: R$ " + valorFinal
                        );

                    } else {

                        System.out.println("Nenhum produto cadastrado.");

                    }

                    break;

                case 8:

                    System.out.println("Saindo...");

                    sc.close();

                    return;

                default:

                    System.out.println("Opção inválida.");

                    break;
            }
        }
    }
}