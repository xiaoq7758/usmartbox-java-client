package cn.acey.integrate.usmartbox.exception;

public class SignatureVerifyException extends RuntimeException {

    public SignatureVerifyException(String message) {
        super(message);
    }

    public SignatureVerifyException(String message, Throwable cause) {
        super(message, cause);
    }
}
