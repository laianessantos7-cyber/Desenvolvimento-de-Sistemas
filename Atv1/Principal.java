import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = null;

        String nome = "";
        String cpf = "";
        double salario = 0;

        while (true) {

            System.out.println("\n===== SISTEMA DE FUNCIONÁRIOS =======");

            System.out.println("1 - Cadastrar funcionário.");
            System.out.println("2 - Escolher tipo de funcionário.");
            System.out.println("3 - Mostrar dados cadastrados.");
            System.out.println("4 - Calcular pagamento.");
            System.out.println("5 - Calcular pagamento com bônus.");
            System.out.println("6 - Consultar dados do funcionário.");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Nome:");
                    nome = sc.next();

                    System.out.println("CPF:");
                    cpf = sc.next();

                    System.out.println("Salário:");
                    salario = sc.nextDouble();

                    System.out.println("Dados cadastrados!");

                    break;

                case 2:

                    System.out.println("1 - Funcionário CLT");
                    System.out.println("2 - Funcionário Freelancer");

                    System.out.println("Escolha o tipo:");

                    int tipo = sc.nextInt();

                    switch (tipo) {

                        case 1:

                            funcionario = new FuncionarioCLT(
                                    nome,
                                    cpf,
                                    salario
                            );

                            System.out.println("Funcionário CLT cadastrado!");

                            break;

                        case 2:

                            System.out.println("Horas trabalhadas:");

                            double horasTrabalhadas = sc.nextDouble();

                            System.out.println("Valor por hora:");

                            double valorPorHora = sc.nextDouble();

                            funcionario = new FuncionarioFreelancer(
                                    nome,
                                    cpf,
                                    salario,
                                    horasTrabalhadas,
                                    valorPorHora
                            );

                            System.out.println("Funcionário Freelancer cadastrado!");

                            break;

                        default:

                            System.out.println("Tipo inválido.");

                            break;
                    }

                    break;

                case 3:

                    if (funcionario != null) {

                        System.out.println("\n===== DADOS CADASTRADOS =====");

                        System.out.println(funcionario.exibirDados());

                    } else {

                        System.out.println("Nenhum funcionário cadastrado.");

                    }

                    break;

                case 4:

                    if (funcionario != null) {

                        if (funcionario instanceof FuncionarioCLT) {

                            FuncionarioCLT clt = (FuncionarioCLT) funcionario;

                            System.out.println(
                                    "Pagamento: R$ " +
                                    clt.calcularPagamento()
                            );

                        } else if (funcionario instanceof FuncionarioFreelancer) {

                            FuncionarioFreelancer freelancer =
                                    (FuncionarioFreelancer) funcionario;

                            System.out.println(
                                    "Pagamento: R$ " +
                                    freelancer.calcularPagamento()
                            );
                        }

                    } else {

                        System.out.println("Nenhum funcionário cadastrado.");

                    }

                    break;

                case 5:

                    if (funcionario != null) {

                        System.out.println("Digite o valor do bônus:");

                        double bonus = sc.nextDouble();

                        if (funcionario instanceof FuncionarioCLT) {

                            FuncionarioCLT clt =
                                    (FuncionarioCLT) funcionario;

                            System.out.println(
                                    "Pagamento com bônus: R$ " +
                                    clt.calcularPagamento(bonus)
                            );

                        } else if (funcionario instanceof FuncionarioFreelancer) {

                            FuncionarioFreelancer freelancer =
                                    (FuncionarioFreelancer) funcionario;

                            System.out.println(
                                    "Pagamento com bônus: R$ " +
                                    freelancer.calcularPagamento(bonus)
                            );

                        }

                    } else {

                        System.out.println("Nenhum funcionário cadastrado.");

                    }

                    break;

                case 6:

                    if (funcionario != null) {

                        System.out.println(
                                "\n===== CONSULTA DO FUNCIONÁRIO ====="
                        );

                        System.out.println(
                                "Nome: " + funcionario.getNome()
                        );

                        System.out.println(
                                "CPF: " + funcionario.getCpf()
                        );

                        System.out.println(
                                "Salário: R$ " + funcionario.getSalario()
                        );

                    } else {

                        System.out.println("Nenhum funcionário cadastrado.");

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