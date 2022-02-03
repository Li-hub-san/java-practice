package exercises.school.teste2;

public class Reboque {
    private int numeroTransporte;
    private int numeroServicos;
    private boolean isAvariado;
    private String tipo;

    protected Reboque(int numeroTransporte, String tipo) {
        this.numeroTransporte = numeroTransporte;
        this.tipo = tipo;
        numeroServicos = 0;
    }

    public void trabalhar() {
        if (isAvariado) {
            System.out.println(tipo + " nº" + numeroTransporte + " avariado. Não posso trabalhar");
        } else {
            numeroServicos++;
            System.out.println("Eu, " + tipo + " nº " + numeroTransporte + ", estou a trabalhar.");
        }
    }

    public void avariar() {
        isAvariado = true;
        System.out.println("Eu, " + tipo + " nº" + numeroTransporte + ", estou avariado. ");
    }


    public int getNumeroTransporte() {
        return numeroTransporte;
    }

    public void setNumeroTransporte(int numeroTransporte) {
        this.numeroTransporte = numeroTransporte;
    }

    public int getNumeroServicos() {
        return numeroServicos;
    }

    public void setNumeroServicos(int numeroServicos) {
        this.numeroServicos = numeroServicos;
    }

    public boolean isAvariado() {
        return isAvariado;
    }

    public void setAvariado(boolean avariado) {
        isAvariado = avariado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
