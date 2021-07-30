package am.aca.disco;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        if (throwable instanceof EmailValidationException) {
            System.out.println(throwable.getMessage());
        }
    }
}
