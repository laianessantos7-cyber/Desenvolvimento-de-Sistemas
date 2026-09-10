import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Carro c= new Carro(0, null, null);
        
        System.out.println("Informe a Marca: ");
        c.setMarca(sc.nextLine());

        System.out.println("Informe o Modelo: ");
        c.setModelo(sc.nextLine());

        System.out.println("Infome o Ano: ");
        c.setAno(sc.nextInt());


        System.out.println("A Marca: "+c.getMarca());
        System.out.println("O Modelo: "+c.getModelo());
        System.out.println("O Ano: "+c.getAno());





        sc.close();
    }
}
