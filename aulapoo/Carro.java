public class Carro {

    private String marca;
    private String modelo;
    private int anofabricacao;

    public Carro(int anofabricacao, String marca, String modelo) {

        
        this.marca = marca;
        this.modelo = modelo;
        this.anofabricacao = anofabricacao;

    }

    public String getMarca() {

        return marca;

    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    public String getModelo() {

        return modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }
    public int getAno() {

        return anofabricacao;

    }

    public void setAno(int anofabricacao) {

        this.anofabricacao = anofabricacao;

    }

}