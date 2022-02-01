package exercises.school.teste2;

import exercises.school.aula13.Company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Reboque> reboques = new ArrayList<>();
        Carro carro1 = new Carro(1, 2);
        Carro carro2 = new Carro(2, 2);
        reboques.add(carro1);
        reboques.add(carro2);

        Barco barco1 = new Barco(1, 1500);
        Barco barco2 = new Barco(1, 2500);
        reboques.add(barco1);
        reboques.add(barco2);

        Empresa javaReboques = new Empresa("Java Reboques", reboques);

        System.out.println("\n-------- Numero de Reeboques em Java Reboques --------");
        System.out.println("Número total de Reboques: " + javaReboques.getNumeroReboques());

        System.out.println("\n-------- colocar os reboques a trabalhar --------");
        for (Reboque reboque : reboques) {
            System.out.println(reboque.trabalhar());
        }

        System.out.println("\n-------- Avariar um reboque --------");
        System.out.println(barco1.avariar());

        System.out.println("\n-------- Voltar a mandar a trabalhar --------");
        System.out.println(barco1.trabalhar());

    }
}
