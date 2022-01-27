package exercises.school.teste2;

public class Reboque {
    private int numeroTransporte;
    private int numeroServiços;
    private boolean avariado;

    public Reboque(int numeroTransporte) {
        this.numeroTransporte = numeroTransporte;
        numeroServiços = 0;
    }

    public Reboque(int numeroTransporte, int numeroServiços) {
        this.numeroTransporte = numeroTransporte;
        numeroServiços = 0;
    }

    public String trabalhar() {
        numeroServiços ++;
        return "Eu ";
    }

    public String avariar() {
        avariado = true;
        return "Estou avariado. ";
    }


    public int getNumeroTransporte() {
        return numeroTransporte;
    }

    public void setNumeroTransporte(int numeroTransporte) {
        this.numeroTransporte = numeroTransporte;
    }

    public int getNumeroServiços() {
        return numeroServiços;
    }

    public void setNumeroServiços(int numeroServiços) {
        this.numeroServiços = numeroServiços;
    }

}
