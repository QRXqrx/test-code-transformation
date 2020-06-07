package nju.pa.exception;

/**
 * Throws when one test method declaration don't have body.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class InvalidCmdOption extends RuntimeException{
    static final long serialVersionUID = -71246614124939L;

    public InvalidCmdOption(String msg) {
        super(msg);
    }
}
