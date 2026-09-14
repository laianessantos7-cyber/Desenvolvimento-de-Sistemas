public class ContatoEmergencia extends Contato {

    private String grauPrioridade;

    public ContatoEmergencia(String nome, String numero, String grauPrioridade) {

        super(nome, numero);

        this.grauPrioridade = grauPrioridade;

    }

    public String getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(String grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }

    @Override
    public String exibirDados() {

        return "Nome: " + getNome()
                + "\nTelefone: " + getNumero()
                + "\nTipo: Emergência"
                + "\nPrioridade: " + grauPrioridade;
    }
}