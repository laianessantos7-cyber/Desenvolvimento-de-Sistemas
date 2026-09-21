import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Curso curso = null;

        int codigo = 0;
        String nome = "";
        int cargaHoraria = 0;
        double valor = 0;

        String aluno = "";

        double valorFinal = 0;

        while (true) {

            System.out.println("\n===== SISTEMA DE CURSOS =====");

            System.out.println("1 - Cadastrar curso");
            System.out.println("2 - Escolher curso presencial ou online");
            System.out.println("3 - Cadastrar nome do aluno");
            System.out.println("4 - Realizar matrícula");
            System.out.println("5 - Realizar matrícula com desconto");
            System.out.println("6 - Mostrar dados do curso");
            System.out.println("7 - Mostrar dados da matrícula");
            System.out.println("8 - Encerrar o programa");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Código do curso:");
                    codigo = sc.nextInt();

                    System.out.println("Nome do curso:");
                    nome = sc.next();

                    System.out.println("Carga horária:");
                    cargaHoraria = sc.nextInt();

                    System.out.println("Valor do curso:");
                    valor = sc.nextDouble();

                    System.out.println("Dados cadastrados!");
                    break;

                case 2:
                    System.out.println("1 - Curso presencial");
                    System.out.println("2 - Curso online");
                    System.out.print("Escolha o tipo: ");

                    int tipo = sc.nextInt();

                    switch (tipo) {

                        case 1:
                            System.out.println("Nome da sala:");
                            String sala = sc.next();

                            System.out.println("Turno:");
                            String turno = sc.next();

                            curso = new CursoPresencial(
                                    codigo,
                                    nome,
                                    cargaHoraria,
                                    valor,
                                    sala,
                                    turno
                            );

                            System.out.println("Curso presencial cadastrado!");
                            break;

                        case 2:
                            System.out.println("Endereço da plataforma:");
                            String plataforma = sc.next();

                            System.out.println("Código de acesso:");
                            String codigoAcesso = sc.next();

                            curso = new CursoOnline(
                                    codigo,
                                    nome,
                                    cargaHoraria,
                                    valor,
                                    plataforma,
                                    codigoAcesso
                            );

                            System.out.println("Curso online cadastrado!");
                            break;

                        default:
                            System.out.println("Tipo inválido.");
                            break;
                    }

                    break;

                case 3:
                    System.out.println("Nome do aluno:");
                    aluno = sc.next();

                    System.out.println("Aluno cadastrado!");
                    break;

                case 4:
                    if (curso != null) {

                        if (curso instanceof CursoPresencial) {

                            CursoPresencial presencial =
                                    (CursoPresencial) curso;

                            valorFinal = presencial.realizarMatricula();

                        } else if (curso instanceof CursoOnline) {

                            CursoOnline online =
                                    (CursoOnline) curso;

                            valorFinal = online.realizarMatricula();
                        }

                        System.out.println("Matrícula realizada!");

                    } else {
                        System.out.println("Nenhum curso cadastrado.");
                    }

                    break;

                case 5:
                    if (curso != null) {

                        System.out.println("Informe o desconto:");
                        double desconto = sc.nextDouble();

                        if (curso instanceof CursoPresencial) {

                            CursoPresencial presencial =
                                    (CursoPresencial) curso;

                            valorFinal =
                                    presencial.realizarMatricula(desconto);

                        } else if (curso instanceof CursoOnline) {

                            CursoOnline online =
                                    (CursoOnline) curso;

                            valorFinal =
                                    online.realizarMatricula(desconto);
                        }

                        System.out.println(
                                "Matrícula com desconto realizada!"
                        );

                    } else {
                        System.out.println("Nenhum curso cadastrado.");
                    }

                    break;

                case 6:
                    if (curso != null) {

                        System.out.println("\n===== DADOS DO CURSO =====");
                        System.out.println(curso.exibirDados());

                    } else {
                        System.out.println("Nenhum curso cadastrado.");
                    }

                    break;

                case 7:
                    if (curso != null) {

                        System.out.println("\n===== DADOS DA MATRÍCULA =====");
                        System.out.println("Aluno: " + aluno);
                        System.out.println("Curso: " + curso.getNome());
                        System.out.println("Valor final: R$ " + valorFinal);

                    } else {
                        System.out.println("Nenhuma matrícula realizada.");
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