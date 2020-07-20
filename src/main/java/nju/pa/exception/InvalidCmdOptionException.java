package nju.pa.exception;

/**
 * Throws when one test method declaration don't have body.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class InvalidCmdOptionException extends RuntimeException{
    static final long serialVersionUID = -71246614124939L;

    public InvalidCmdOptionException(String msg) {
        super(msg);
    }
}
