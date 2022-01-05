package exercises.school;

import java.util.Scanner;

public class Exercise3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois números:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a < b) {
      System.out.println("Maior: " + b);
    } else if (a > b) {
      System.out.println("Maior: " + a);
    } else {
      System.out.println("Os numeros são iguais");
    }

    System.out.println("Digite dois nomes:");
    String nome1 = sc.next();
    String nome2 = sc.next();

    int name1Length = nome1.length();
    int name2Length = nome2.length();
    String output = "O maior nome é ";

    if (name1Length < name2Length) {
      System.out.println(output + nome2 + " com comprimento de " + name2Length + " letras.");
    } else {
      System.out.println(output + nome1 + " com comprimento de " + name1Length + " letras ");
    }

    sc.close();
  }

}
