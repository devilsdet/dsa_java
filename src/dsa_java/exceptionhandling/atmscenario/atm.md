Create an ATM class to perform deposit and withdrawal operations. 
Define custom exceptions InvalidAmountException, InsufficientFundsException 
to handle operations done by the customer in deposit and withdrawal operations .

Here we need to develop mainly 5 Java classes,

InvalidAmountException:- for user-defined custom exception
InsufficientFundsException:- for user-defined custom exception
ATMCard:- An interface, which has properties deposit(), withdraw() and balanceEnquiry().
Citibank:- A class implemented from ATMCard interface
ATM:- A class to perform operations of ATM (automatic tailer machine).