import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Veiculo veiculo = null;

        String placa = "";
        String modelo = "";
        int ano = 0;
        double valorDiaria = 0;

        while (true) {

            System.out.println("\n===== SISTEMA DE LOCAÇÃO DE VEÍCULOS =====");

            System.out.println("1 - Cadastrar veículo.");
            System.out.println("2 - Escolher tipo de veículo.");
            System.out.println("3 - Mostrar dados cadastrados.");
            System.out.println("4 - Informar dias de aluguel.");
            System.out.println("5 - Calcular aluguel.");
            System.out.println("6 - Calcular aluguel com desconto.");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Placa:");
                    placa = sc.next();

                    System.out.println("Modelo:");
                    modelo = sc.next();

                    System.out.println("Ano:");
                    ano = sc.nextInt();

                    System.out.println("Valor da diária:");
                    valorDiaria = sc.nextDouble();

                    System.out.println("Dados cadastrados!");

                    break;

                case 2:

                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");

                    System.out.println("Escolha o tipo:");

                    int tipo = sc.nextInt();

                    switch (tipo) {

                        case 1:

                            veiculo = new Carro(
                                    placa,
                                    modelo,
                                    ano,
                                    valorDiaria
                            );

                            System.out.println("Carro cadastrado!");

                            break;

                        case 2:

                            veiculo = new Moto(
                                    placa,
                                    modelo,
                                    ano,
                                    valorDiaria
                            );

                            System.out.println("Moto cadastrada!");

                            break;

                        default:

                            System.out.println("Tipo inválido.");

                            break;
                    }

                    break;

                case 3:

                    if (veiculo != null) {

                        System.out.println("\n===== DADOS CADASTRADOS =====");

                        System.out.println(veiculo.exibirDados());

                    } else {

                        System.out.println("Nenhum veículo cadastrado.");

                    }

                    break;

                case 4:

                    if (veiculo != null) {

                        System.out.println("Informe a quantidade de dias:");

                        int dias = sc.nextInt();

                        if (veiculo instanceof Carro) {

                            Carro carro = (Carro) veiculo;

                            carro.setDias(dias);

                        } else if (veiculo instanceof Moto) {

                            Moto moto = (Moto) veiculo;

                            moto.setDias(dias);

                        }

                        System.out.println("Dias informados!");

                    } else {

                        System.out.println("Nenhum veículo cadastrado.");

                    }

                    break;

                case 5:

                    if (veiculo != null) {

                        if (veiculo instanceof Carro) {

                            Carro carro = (Carro) veiculo;

                            System.out.println(
                                    "Valor do aluguel: R$ " +
                                    carro.calcularAluguel()
                            );

                        } else if (veiculo instanceof Moto) {

                            Moto moto = (Moto) veiculo;

                            System.out.println(
                                    "Valor do aluguel: R$ " +
                                    moto.calcularAluguel()
                            );

                        }

                    } else {

                        System.out.println("Nenhum veículo cadastrado.");

                    }

                    break;

                case 6:

                    if (veiculo != null) {

                        System.out.println("Digite o valor do desconto:");

                        double desconto = sc.nextDouble();

                        if (veiculo instanceof Carro) {

                            Carro carro = (Carro) veiculo;

                            System.out.println(
                                    "Valor do aluguel com desconto: R$ " +
                                    carro.calcularAluguel(desconto)
                            );

                        } else if (veiculo instanceof Moto) {

                            Moto moto = (Moto) veiculo;

                            System.out.println(
                                    "Valor do aluguel com desconto: R$ " +
                                    moto.calcularAluguel(desconto)
                            );

                        }

                    } else {

                        System.out.println("Nenhum veículo cadastrado.");

                    }

                    break;

                case 7:

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