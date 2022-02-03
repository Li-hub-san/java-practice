package exercises.school.exceptions;

public class SemLetraException extends Exception {

    @Override
    public String getMessage() {
        return "Sem letra A";
    }

}
