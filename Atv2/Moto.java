public class Moto extends Veiculo implements Aluguel {

    private int dias;

    public Moto(String placa, String modelo, int ano, double valorDiaria) {

        super(placa, modelo, ano, valorDiaria);

    }

    public int getDias() {

        return dias;

    }

    public void setDias(int dias) {

        this.dias = dias;

    }

    @Override
    public double calcularAluguel() {

        return getValorDiaria() * dias;

    }

    public double calcularAluguel(double desconto) {

        return (getValorDiaria() * dias) - desconto;

    }

}