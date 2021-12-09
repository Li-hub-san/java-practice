package exercises.school;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println("Vc tem " + idade + " anos.");

        System.out.println("Como se chama?");
        String nome = s.next();
        System.out.println("Voc� chama-se " + nome + "!");
        
        s.close();
    }

}
