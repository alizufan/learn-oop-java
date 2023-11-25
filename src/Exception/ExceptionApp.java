package Exception;

import Exception.Error.ValidationException;
import Exception.Utility.ValidationUtility;

// # Exception
//   - When we create an application, we will not avoid errors.
//   - In Java, errors are represented by the term exception,
//     and everything is represented in the form of an exception class.
//   - We can use our own exception class, or use one provided by Java.
//   - If we want to create an exception,
//     then we have to create a class that extends class Throwable or its derivatives.
//
// # How to Create an Exception?
//   - Exceptions usually occur in methods,
//     when we create an exception in a method,
//     the method must be marked with the throw keyword followed by the exception class.
//   - If the method can raise more than one type of exception,
//     we can add more than one exception class.
//   - In our program code, to create an exception we simply use the throw keyword,
//     followed by the exception object.
//
// # Try Catch
//   - When we call a function that can cause an exception,
//     we must use a try-catch expression in Java.
//   - This is so that we can catch exceptions that occur,
//     because if they are not caught, then an exception occurs,
//     then our program will automatically stop.
//   - How to use a try-catch expression in Java is straightforward,
//     in the try block, we just call a method that can cause an exception,
//     and in the catch block, we can do something if an exception occurs.
//
// # Try Catch: finally keyword
//   - In try-catch, we can add a 'finally' block.
//   - This finally block is a block that will
//     always be executed whether an exception occurs or not.
//   - This is very suitable when we want to do something,
//     no matter whether it succeeds or fails.
//     For example, in the try block we want to read a file,
//     in the catch block we will catch it if an error occurs.
//     In the 'finally' error block or successful reading of the file,
//     we must close the connection to the file,
//     so it doesn't hang-in memory.
//
public class ExceptionApp {
  public static void main(String[] args) {
    String username = null;//"August";
    String password = null;//"secret";

    try {
      ValidationUtility.validate(username, password);
      System.out.println("Data valid!");
    } catch (ValidationException e) {
      System.out.println("Data isn't valid: " + e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("Data is null: " + e.getMessage());
    } finally {
      System.out.println("Always Executed: Your Try Catch Complete");
    }
  }
}
