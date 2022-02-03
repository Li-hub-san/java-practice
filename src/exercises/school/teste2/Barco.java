package exercises.school.teste2;

public class Barco extends Reboque {
    ;
    private double comprimento;
    private double largura;

    public Barco(int numeroTransporte, String tipo, double comprimento) {
        super(numeroTransporte, tipo);
        this.comprimento = comprimento;
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
