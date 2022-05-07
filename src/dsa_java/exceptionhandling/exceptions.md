## User-defined Custom Exception in Java

An exception is an issue (run time error) that occurred during the execution of a program. 
When an exception occurred the program gets terminated abruptly and, 
the code past the line that generated the exception never gets executed.

1. Java provides us the facility to create our own exceptions which are basically 
derived classes of Exception. Creating our own Exception is known as a custom exception 
or user-defined exception. Basically, Java custom exceptions are used to customize the 
exception according to user needs.  In simple words, we can say that a User-Defined Exception or 
custom exception is creating your own exception class and throwing that exception using the ‘throw’ keyword.


Following are a few of the reasons to use custom exceptions:

To catch and provide specific treatment to a subset of existing Java exceptions.
Business logic exceptions: These are the exceptions related to business logic and workflow. 
It is useful for the application users or the developers to understand the exact problem.

### Custom Checked Exception
Checked exceptions are exceptions that need to be treated explicitly.

