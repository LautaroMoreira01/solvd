package programExceptions;

public class invalidHoursException extends Exception {
    public invalidHoursException(String errorMessage) {
        super(errorMessage);
    }
}