import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 1000.00;

        System.out.println("\n====== Bem-vindo ao SafeBank =====");

        try {
            System.out.println("Saldo disponível: R$ " + saldo);

            System.out.print("Digite o valor do saque: ");
            double valorSaque = sc.nextDouble();

            if (valorSaque <0) {
                System.out.println("Erro: o valor do saque deve ser maior que zero.");

            } else if (valorSaque> saldo) {
                System.out.println("Erro: saldo insuficiente.");

            } else {
                saldo-=valorSaque;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Novo saldo: R$ " + saldo);
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro crítico: entrada inválida! Por favor, use apenas números.");

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());

        } finally {
            System.out.println("Operação finalizada");
        }

        sc.close();
    }
}