package exercises.school.teste2;

public class Reboque {
    private int numeroTransporte;
    private int numeroServicos;
    private boolean isAvariado;

    public Reboque(int numeroTransporte) {
        this.numeroTransporte = numeroTransporte;
        numeroServicos = 0;
    }

    public Reboque(int numeroTransporte, int numeroServicos) {
        this.numeroTransporte = numeroTransporte;
        numeroServicos = 0;
    }

    public String trabalhar() {
//        if (isAvariado) {
//            System.out.println("Estou avariao, não posso trabalhar.");
//        }
        numeroServicos++;
        return "Eu ";
    }

    public String avariar() {
        isAvariado = true;
        return "Estou avariado. ";
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
}
