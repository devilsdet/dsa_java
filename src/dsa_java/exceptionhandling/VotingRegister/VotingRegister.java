package dsa_java.exceptionhandling.VotingRegister;

import java.util.Scanner;

public class VotingRegister {
    private static void checkAge(int age) throws NotEligibleException {
        if(age < 17) {
            throw new NotEligibleException("Age < 17, not eligible ofr voting");
        }
        }
    public static void main(String[] args) throws NotEligibleException {
        System.out.println("Provide your age -> ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("The age provided is: " + age);
        checkAge(age);
        System.out.println(" Registered you successfully : ");


    }
}
