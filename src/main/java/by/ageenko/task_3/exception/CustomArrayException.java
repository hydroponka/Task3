package by.ageenko.task_3.exception;

public class CustomArrayException extends Exception{
    public CustomArrayException() {
    }

    public CustomArrayException(String message) {
        super(message);
    }

    public CustomArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomArrayException(Throwable cause) {
        super(cause);
    }
}
