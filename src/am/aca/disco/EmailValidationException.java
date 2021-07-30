package am.aca.disco;

public class EmailValidationException extends RuntimeException{
    private final String message;

    public EmailValidationException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
