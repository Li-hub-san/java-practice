package exercises.school.teste2;

public class Carro extends Reboque {
    private int lugaresSentados;
    private double pesoMaxRebocavel;

    public Carro(int numeroTransporte, String tipo, int pesoMaxRebocavel) {
        super(numeroTransporte, tipo);
        this.pesoMaxRebocavel = pesoMaxRebocavel;
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
