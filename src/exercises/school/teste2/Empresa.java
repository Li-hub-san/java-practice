package exercises.school.teste2;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements EmpresaInterface {
    private String nome;
    private List<Reboque> reboques;

    public Empresa(String nome, List<Reboque> reboques) {
        this.nome = nome;
        this.reboques = reboques;
    }

    public void addReboques(Reboque reboque) {
        reboques.add(reboque);
    }

    @Override
    public int getNumeroReboques() {
        return reboques.size();
    }

    public List<Reboque> getReboquesAvariados() {
        List<Reboque> reboquesAvariados = new ArrayList<>();

        for (Reboque reboqueAtual : reboques) {
            if (reboqueAtual.isAvariado()) {
                reboquesAvariados.add(reboqueAtual);
            }
        }

        return reboquesAvariados;
    }

    @Override
    public int getNumeroReboquesAvariados() {
        return getReboquesAvariados().size();
    }


    @Override
    public String toString() {
        return "Empresa{" + "nome='" + nome + '\'' + ", reboques=" + reboques + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(List<Reboque> reboques) {
        this.reboques = reboques;
    }
}
