package dsa_java.exceptionhandling.atmscenario;

public class SBICard implements ATMCard{
    static int amount = 1000;
    static String pin = "3214";

    public void pinCheck(String pin) {
       if(!pin.equalsIgnoreCase(this.pin)) {
           throw new InvalidPinException("The Entered Pin is invalid. " +
                   "Please enter the pin correctly.");
       }
    }

    public void deposit(int amount) throws InValidAmountException {
        if(amount < 0) {
            throw new InValidAmountException("Entered amount is incorrect. Please enter" +
                    "valid amount");
        }
        this.amount += amount;
    }

    public void withdraw(int amount) throws InValidAmountException, InSufficientFundException {
        if(amount < 0) {
            throw new InValidAmountException("Entered amount is incorrect. Please enter" +
                    "valid amount");
        } else if(amount > this.amount) {
            throw new InSufficientFundException("Insufficient Fund. Please check balacne");
        }
        this.amount -= amount;
    }

    public int checkBalance() {
        return this.amount;
    }
}
