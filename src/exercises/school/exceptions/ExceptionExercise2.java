package exercises.school.exceptions;

import java.util.Locale;

public class ExceptionExercise2 {

    public static void main(String[] args) {
        String nome = "Lígia";

        try {
            validar(nome);
            validar("Juan");
            validar("Ju");
            validar(null);
            validar("Leticia");

        } catch (SemLetraException e){
            System.out.println("1st Catch: ocorreu um erro: " + e.getMessage());
        } catch (NullPointerException exception){
            System.out.println("2nd Catch exception: " + exception.getMessage());
        } finally {
            System.out.println("""
                    O finally corre sempre!
                    Funciona do género de 'sc.close'.
                    Fica sempre depois do último 'catch'.
                    """);
        }

    }

    public static void validar(String nome) throws SemLetraException {
        if (!(nome.contains("a") || nome.contains("A"))) {
            throw new SemLetraException();
        } else {
            System.out.println("Contém a letra 'a'.");
        }
    }

}
