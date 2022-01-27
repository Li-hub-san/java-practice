package exercises.school.teste2;

public class Carro extends Reboque {
    private int lugaresSentados;
    private double pesoMaxRebocavel;

    public Carro(int numeroTransporte, int pesoMaxRebocavel) {
        super(numeroTransporte);
        this.pesoMaxRebocavel = pesoMaxRebocavel;
    }

    @Override
    public String trabalhar() {
        return super.trabalhar() + "carro nº" + getNumeroTransporte() + " estou a trabalhar.";
    }

    @Override
    public String avariar() {
        return super.avariar() + "Carro nº" + getNumeroTransporte() + " está fora de serviço.";
    }

    @Override
    public String toString() {
        return "Carro{" +
                "lugaresSentados=" + lugaresSentados +
                ", pesoMaxRebocavel=" + pesoMaxRebocavel +
                '}';
    }

    public double getPesoMaxRebocavel() {
        return pesoMaxRebocavel;
    }

    public void setPesoMaxRebocavel(int pesoMaxRebocavel) {
        this.pesoMaxRebocavel = pesoMaxRebocavel;
    }

    public double getLugaresSentados() {
        return pesoMaxRebocavel;
    }

    public void setLugaresSentados(int lugaresSentados) {
        this.pesoMaxRebocavel = pesoMaxRebocavel;
    }
}
