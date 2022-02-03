package exercises.school.teste2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Reboque> reboques = new ArrayList<>();
        Carro carro1 = new Carro(1, "carro", 2);
        Carro carro2 = new Carro(2, "carro", 2);
        reboques.add(carro1);
        reboques.add(carro2);

        Barco barco1 = new Barco(1, "barco", 1500);
        Barco barco2 = new Barco(2, "barco", 2500);
        reboques.add(barco1);
        reboques.add(barco2);

        Empresa javaReboques = new Empresa("Java Reboques", reboques);

        System.out.println("\n-------- Numero de Reeboques em Java Reboques --------");
        System.out.println("Número total de Reboques: " + javaReboques.getNumeroReboques());

        System.out.println("\n-------- Colocar todos os reboques a trabalhar --------");
        for (Reboque reboque : reboques) {
            reboque.trabalhar();
        }
        for (Reboque reboque : reboques) {
            reboque.trabalhar();
        }
        carro2.trabalhar();
        barco2.trabalhar();

        System.out.println("\n-------- Avariar dois reboques --------");
        carro1.avariar();
        barco1.avariar();

        System.out.println("\n-------- Numero de reboques avariados --------");
        System.out.println(javaReboques.getNumeroReboquesAvariados());

        System.out.println("\n-------- Voltar a mandar a trabalhar o reboque avariado --------");
        carro1.trabalhar();
        barco1.trabalhar();

        System.out.println("\n-------- Trabalhos efetuados --------");
        for (Reboque reboque : reboques
        ) {
            System.out.println(reboque.getNumeroServicos());
        }

    }

}
