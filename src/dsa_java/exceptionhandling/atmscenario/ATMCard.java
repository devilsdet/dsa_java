package dsa_java.exceptionhandling.atmscenario;

public interface ATMCard {
    void pinCheck(String pin);
    void deposit(int amount) throws InValidAmountException;
    void withdraw(int amount) throws InValidAmountException, InSufficientFundException;
    int checkBalance();

}
