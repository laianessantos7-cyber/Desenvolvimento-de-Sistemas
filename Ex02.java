import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("exemplo.text", true);
            escritor.write("Primeira linha \n");
            escritor.write("Segunda linha \n");
            escritor.write("Terceira linha \n");

            escritor.close();
            System.out.println("Escrita concluida.");
        }catch(IOException e){
            System.out.println("Erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
    
}
