package exceptions;

public class ExpiredException extends AssertionError{
    public static final String EXPIRED_CARD_TODAY = "Expired Card before time";
    public static final String SHOULD_EXPIRED = "Should Expired Card ";
    public static final String NO_WIN = "NO WINNER";

    public ExpiredException(String message, Throwable cause){super(message,cause);}

}
