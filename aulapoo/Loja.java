public class Loja {

    private String nome;
    private float preco;
    private int quantidade;

    public Loja(float preco, int quantidade, String nome) {

        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public float getPreco() {

        return preco;
    }

    public void setPreco(float preco) {

        this.preco = preco;
    }
}