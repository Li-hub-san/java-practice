package exercises.school;

import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int age = s.nextInt();
    System.out.println("Você tem " + age + " anos.");

    System.out.println("Como se chama?");
    String nome = s.next();
    System.out.println("Você chama-se " + nome + "!");

    s.close();
  }

}
