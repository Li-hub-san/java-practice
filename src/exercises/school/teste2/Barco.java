package exercises.school.teste2;

public class Barco extends Reboque{
    private double comprimento;
    private double largura;

    public Barco(int numeroTransporte, double comprimento ) {
        super(numeroTransporte);
        this.comprimento = comprimento;
    }

    @Override
    public String trabalhar() {
        return super.trabalhar() +"carro nº" + getNumeroTransporte() + " estou a trabalhar.";
    }

    @Override
    public String avariar() {
        return super.avariar() + "Barco nº" + getNumeroTransporte() + " está fora de serviço.";
    }

    @Override
    public String toString() {
        return "Barco{" +
                "comprimento=" + comprimento +
                ", largura=" + largura +
                '}';
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
