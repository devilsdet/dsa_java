package dsa_java.exceptionhandling.atmscenario;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws InValidAmountException, InSufficientFundException {
        Scanner scn = new Scanner(System.in);
        String bankOption;
        int depositAmount;
        int withdrawAmount;
        int option;
        String pin;
        String continueOption;

        while(true) {
            System.out.println("Enter your (Cards) ATM name: ");
            bankOption = scn.next();
            ATMCard card = new SBICard();
            System.out.println("Enter Your PIN: ");
            pin = scn.next();
            card.pinCheck(pin);
            while (true) {
                System.out.println("Please choose the options for operations");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                option = scn.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Please Enter The Amount to deposit: ");
                        depositAmount = scn.nextInt();
                        card.deposit(depositAmount);
                        System.out.println("The Amount deposited succesfully");
                        break;
                    case 2:
                        System.out.println("Please Enter the amount to Withdraw: ");
                        withdrawAmount = scn.nextInt();
                        card.withdraw(withdrawAmount);
                        System.out.println("The Amount withdrwn successfully");
                        break;
                    case 3:
                        System.out.println("The Available balance is " +  card.checkBalance());
                        break;
                    default:
                        System.out.println("Invalid option. " + " Please choose an option from 1 to 3");
                }
                System.out.println("Press Y to continue or N to exit");
                continueOption = scn.next();
                if(continueOption.equalsIgnoreCase("N")) {
                    System.out.println("****** Thank you For visiting us *******");
                    System.exit(1);

                }
            }
        }
    }
}
