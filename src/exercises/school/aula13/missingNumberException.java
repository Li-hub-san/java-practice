package exercises.school.aula13;

public class missingNumberException extends Exception {
//    public static void main(String[] args){}
    public String getMessage() {
        return "Tem de ser um número maior que 10.";
    }

}
