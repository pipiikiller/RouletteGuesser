package exception;

/**
 * Created by Bartek on 2017-05-08.
 */
public class GusserException extends RuntimeException {
    public GusserException(String s) {
        super("Invalid Number:" + s);
    }
}
