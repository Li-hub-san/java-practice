package exercises.school.exceptions;

public class MissingNumberException extends Exception {

    @Override
    public String getMessage() {
        return "Tem de ser um número > 10.";
    }

}
