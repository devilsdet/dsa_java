package dsa_java.exceptionhandling.VotingRegister;

public final class NotEligibleException extends Exception{
    public NotEligibleException() { }
    public NotEligibleException(String message) {
        super(message);
    }
}
