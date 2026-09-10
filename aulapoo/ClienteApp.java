import java.util.Scanner;
public class ClienteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int op;
        
        do{
            System.out.println("\n========== Sistema de Cadastro de Clientes ===========");
            System.out.println("1- Pessoa Fisica");
            System.out.println("2- Pessoa Juridica");
            System.out.println("0- Sair");
            System.out.println("Ecolha a opção: ");

            while(!sc.hasNextInt()){
                System.out.println("Opção in válida. Digite 0, 1 ou 2.");
                sc.next();
            }
            op=sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: {
                    System.out.println("Informe o nome: ");
                    String nome= sc.nextLine();

                    System.out.println("Informe o Endereço: ");
                    String endereco= sc.nextLine();

                    System.out.println("Informe o CPF: ");
                    String cpf= sc.nextLine();

                    ClientePF pf = new ClientePF(nome, endereco, cpf);
                    pf.setNome(nome);
                    pf.setEndereco(endereco);
                    pf.setCpf(cpf);

                    System.out.println("\n--- Dados do Cliente PF ---");
                    pf.exibirDados();
                    break;
                }

                case 2:{
                    System.out.println("Informe o nome: ");
                    String nome= sc.nextLine();

                    System.out.println("Informe o Endereço: ");
                    String endereco= sc.nextLine();

                    System.out.println("Informe o CNPJ: ");
                    String cnpj= sc.nextLine();

                    ClientePJ pj = new ClientePJ (nome, endereco, cnpj);
                    pj.setNome(nome);
                    pj.setEndereco(endereco);
                    pj.setCnpj(cnpj);
    
                    pj.exibirDados();
            
                    break;
                }
                case 0:
                    System.out.println("Encerrando........");
                default:
                    System.out.println("Opcao Invalida.");
                    break;
                
            }

        }while(op!=0);





        sc.close();
    }
    
}
