public class CursoOnline extends Curso implements Matricula {

    private String plataforma;
    private String codigoAcesso;

    public CursoOnline(int codigo, String nome, int cargaHoraria,
                       double valor, String plataforma, String codigoAcesso) {

        super(codigo, nome, cargaHoraria, valor);

        this.plataforma = plataforma;
        this.codigoAcesso = codigoAcesso;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados()
                + " Plataforma: " + plataforma
                + " Código de acesso: " + codigoAcesso;
    }

    @Override
    public double realizarMatricula() {
        return getValor();
    }

    public double realizarMatricula(double desconto) {
        return getValor() - desconto;
    }
}