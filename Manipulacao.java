
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manipulacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== MANIPULAÇÃO DE ARQUIVOS =====");
            System.out.println("1 - Criar arquivo");
            System.out.println("2 - Escrever no arquivo");
            System.out.println("3 - Ler arquivo");
            System.out.println("4 - Alterar arquivo");
            System.out.println("5 - Remover arquivo");
            System.out.println("6 - Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    try {

                        File arquivo = new File("arquivo.txt");

                        if (arquivo.createNewFile()) {
                            System.out.println("Arquivo criado: " + arquivo.getName());
                        } else {
                            System.out.println("Arquivo já existe.");
                        }

                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo: " + e.getMessage());
                    }

                    break;

                case 2:

                    try {

                        FileWriter writer = new FileWriter("arquivo.txt");

                        writer.write("Olá, este é o conteúdo inicial\n");
                        writer.write("Linha 2 do arquivo\n");

                        writer.close();

                        System.out.println("Conteúdo escrito com sucesso!");

                    } catch (IOException e) {
                        System.out.println("Erro ao escrever: " + e.getMessage());
                    }

                    break;

                case 3:

                    try {

                        BufferedReader reader =
                                new BufferedReader(new FileReader("arquivo.txt"));

                        String linha;

                        System.out.println("\n===== CONTEÚDO DO ARQUIVO =====");

                        while ((linha = reader.readLine()) != null) {
                            System.out.println(linha);
                        }

                        reader.close();

                    } catch (IOException e) {
                        System.out.println("Erro ao ler: " + e.getMessage());
                    }

                    break;

                case 4:

                    try {

                        FileWriter fw = new FileWriter("arquivo.txt");

                        fw.write("Conteúdo Alterado\n");
                        fw.write("Nova informação no arquivo");

                        fw.close();

                        System.out.println("Arquivo alterado com sucesso!");

                    } catch (IOException e) {
                        System.out.println("Erro ao alterar: " + e.getMessage());
                    }

                    break;

                case 5:

                    File arquivo = new File("arquivo.txt");

                    if (arquivo.delete()) {
                        System.out.println("Arquivo removido!");
                    } else {
                        System.out.println("Erro ao remover o arquivo.");
                    }

                    break;

                case 6:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 6);

        sc.close();
    }
}
