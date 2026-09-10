import java.util.Scanner;

public class LojaApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Loja c = new Loja(0, 0, null);

        System.out.println("Informe o Nome do Produto: ");

        c.setNome(sc.nextLine());

        System.out.println("Informe o Preço do Produto: ");

        c.setPreco(sc.nextFloat());

        System.out.println("Informe a Quantidade do Produto: ");

        c.setQuantidade(sc.nextInt());

        System.out.println("Nome: " + c.getNome());

        System.out.println("Preço: " + c.getPreco());

        System.out.println("Quantidade: " + c.getQuantidade());

        sc.close();

    }

}