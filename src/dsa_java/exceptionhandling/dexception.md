What is an exception:
============================
An unwanted or unexpected event that disturbs the normal flow of program is called exception.

The main purpose of Exception handling is used to handle the gracefully shutdown functionality.

The method which is responsible for exception rising, should handle the exception.

What is stack trace:
Simply put, a stack trace is a representation of a call stack at a certain point in time,
with each element representing a method invocation.

Default Handling exception:
==================================
Once any exception occurs the method have to get all the detail and report it to jvm.
Then jvm will ask the method , do you have any handling mechanism for this exception.
If the method tells there is no such mechanism, it will terminate the method and remove it from
stack trace.Now the jvm will approach the caller of this removed method and check if there are 
any handling code.
At the end the JVM will handle it and give it to Default exception handler.
Default handler exception will say (Exception in thread main)

Exception in thread main (AE divide by zero)
    then stack trace

Exceptions are recoverable.

Exception Hierarchy
=======================================
                        Throwable (Class)
                            /           \
                        Exception      Error

Checked VS Unchecked Exception
=========================================
throws keyword is associated checked exception
Customized exceptions are unchecked exception
Exceptions are always occurs at run time. There is error at compile time (syntax error).

The checked exceptions are detected by compiler at compile time for the smooth exection
of program. These excpetions are handled by try catch block or by throws statement.

FileNotFoundExcetion/Interupted Exceptions is the checked exception.

The exceptions which are not checked by compiler, are called unchecked exceptions.These exceptions
are reported at run time. Hence it is also called Runtime Exception too.

Customized Exception Handling by using try catch
=====================================================

Methods to print exception
=================================
  These following methods are available in Throwable class.
2. e.printStarckTrace() ( Name of exception + Description of the exception + stackTrace )
3. e.toString(); (Name of exception + Description of exception)
4. e.getMessage(); (Description of the exception)


Finally block:
===========================
The clean up code should not be written in catch block.
We should write it in finally block.
try {
} catch(Exception e) {
} finally {

}

if any exceptions are not caught by catch block, finally will be executed.

throw keyword
==============================
it will handover the exceptions to JVM.  Throw keyword is applicable for throwable error.


throws exception:
====================================================
This is for checked exception. checked exceptions help to program to run.
The resposnibility of throws keyword is to delegate the resposibilty of handling of exception
to caller method or JVM.
It is reqiuired only to convince compiler and its usage does not prevent abnormal termination of program.


Difference between final, finally and finalize keyword.
===============================================================
Final is access modifier . it is applicable for classes, methods, variables too. If a class is declared
as final, the inheritance is not possible. If a method is declared as final, we cant override the method.
final variables are declared as constants.

Finally is used in try catch exception handling. this is used for resource deallocation code.


Finalize is used in garbage collector.


Try With Resources
================================
In traditional try catch , we have to write the finally block to close the resource. So the complexity of the 
program will increasee and number of lines of code will increase too.

The biggest benefit of try with resource is that we dont have to write the finally block. Compiler will 
take care it at the end of try block (intentionally/Unintentionally)

try(BufferReader br = new BufferReader(new FIle("path))) {
    br.open();
} catch() {
}




                        




