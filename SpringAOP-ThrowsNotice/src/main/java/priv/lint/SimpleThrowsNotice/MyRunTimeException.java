package priv.lint.SimpleThrowsNotice;

public class MyRunTimeException extends MyException {
    public MyRunTimeException() {
        super();
    }

    public MyRunTimeException(String message) {
        super(message);
    }
}
