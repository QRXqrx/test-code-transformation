package nju.pa.exception;

/**
 * Throws when one test method declaration don't have body.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class EmptyMethodBodyException extends RuntimeException{
    static final long serialVersionUID = -712466939L;

    public EmptyMethodBodyException(String msg) {
        super(msg);
    }
}
