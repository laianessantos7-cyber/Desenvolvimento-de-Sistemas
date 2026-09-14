import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {

            System.out.println("\n================== AGENDA DE CONTATOS ==================");

            System.out.println("1 - Cadastrar contato pessoal");
            System.out.println("2 - Cadastrar contato profissional");
            System.out.println("3 - Cadastrar contato de emergência");
            System.out.println("4 - Listar todos os contatos");
            System.out.println("5 - Pesquisar contato");
            System.out.println("6 - Alterar contato");
            System.out.println("7 - Excluir contato");
            System.out.println("8 - Sair");

            System.out.println("Escolha uma opção:");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:

                    System.out.println("Informe o Nome:");
                    String nome = sc.nextLine();

                    System.out.println("Informe o Telefone:");
                    String numero = sc.nextLine();

                    System.out.println("Informe o Parentesco:");
                    String parentesco = sc.nextLine();

                    contatos.add(new ContatoPessoal(nome, numero, parentesco));

                    System.out.println("Contato Pessoal Cadastrado!");

                    break;


                case 2:

                    System.out.println("Informe o Nome:");
                    String nomeProfissional = sc.nextLine();

                    System.out.println("Informe o Telefone:");
                    String numeroProfissional = sc.nextLine();

                    System.out.println("Informe a Empresa:");
                    String empresa = sc.nextLine();

                    System.out.println("Informe o Cargo:");
                    String cargo = sc.nextLine();

                    contatos.add(new ContatoProfissional(
                            nomeProfissional,
                            numeroProfissional,
                            empresa,
                            cargo
                    ));

                    System.out.println("Contato Profissional Cadastrado!");

                    break;


                case 3:

                    System.out.println("Informe o Nome:");
                    String nomeEmergencia = sc.nextLine();

                    System.out.println("Informe o Telefone:");
                    String numeroEmergencia = sc.nextLine();

                    System.out.println("Informe o Grau de Prioridade:");
                    String grauPrioridade = sc.nextLine();

                    contatos.add(new ContatoEmergencia(
                            nomeEmergencia,
                            numeroEmergencia,
                            grauPrioridade
                    ));

                    System.out.println("Contato de Emergência Cadastrado!");

                    break;


                case 4:

                    System.out.println("\n============ CONTATOS CADASTRADOS ============");

                    for (int i = 0; i < contatos.size(); i++) {

                        System.out.println((i + 1) + " - ");
                        System.out.println(contatos.get(i).exibirDados());
                        System.out.println();

                    }

                    break;


                case 5:

                    System.out.println("Digite o nome para pesquisar:");

                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < contatos.size(); i++) {

                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {

                            System.out.println("Contato Encontrado!");
                            System.out.println(contatos.get(i).exibirDados());

                            encontrado = true;
                        }
                    }

                    if (!encontrado) {

                        System.out.println("Contato não encontrado!");

                    }

                    break;


                case 6:

                    System.out.println("\n======== CONTATOS =========");

                    for (int i = 0; i < contatos.size(); i++) {

                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());

                    }

                    System.out.println("Informe o Número do contato que deseja alterar:");

                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos > 0 && pos <= contatos.size()) {

                        System.out.println("Novo Nome:");
                        String novoNome = sc.nextLine();

                        System.out.println("Novo Telefone:");
                        String novoNumero = sc.nextLine();

                        contatos.get(pos - 1).setNome(novoNome);
                        contatos.get(pos - 1).setNumero(novoNumero);

                        System.out.println("Contato alterado com sucesso!");

                    } else {

                        System.out.println("Contato inválido!");

                    }

                    break;


                case 7:

                    System.out.println("========= CONTATOS =========");

                    for (int i = 0; i < contatos.size(); i++) {

                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());

                    }

                    System.out.println("Informe o número do contato que deseja excluir:");

                    int indice = sc.nextInt();
                    sc.nextLine();

                    if (indice > 0 && indice <= contatos.size()) {

                        contatos.remove(indice - 1);

                        System.out.println("Contato excluído com sucesso!");

                    } else {

                        System.out.println("Contato inválido!");

                    }

                    break;


                case 8:

                    System.out.println("Encerrando...");

                    sc.close();

                    return;


                default:

                    System.out.println("Opção inválida!");

                    break;
            }
        }
    }
}