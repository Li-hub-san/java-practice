package exercises.school;

import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um n�mero:");

        int userNumber = s.nextInt();

        for (int i = 0; i <= userNumber; i++) {
            System.out.println(i);
        }

        System.out.println("Digite outro n�mero:");
        int userNumber2 = s.nextInt();

        int sum = 0;
        int i = 0;
        while (i <= userNumber) {
            sum += i;
            System.out.println(sum);
            i++;
        }

        System.out.println("A soma de 0 a " + userNumber2 + " �: " + sum);
        
        s.close();
    }

}

