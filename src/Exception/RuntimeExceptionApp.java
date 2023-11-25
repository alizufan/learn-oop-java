package Exception;

import Exception.Utility.ValidationUtility;

// # Runtime Exception
//   - Runtime exceptions are a type of exception that does not have to be caught using try catch.
//   - The Java compiler will not protest even if we do not use 'try catch'
//     when we call a method that could cause a runtime exception.
//   - To create a runtime exception class, we must extend the RuntimeException class.
//   - There are many in Java that are runtime exceptions,
//     such as NullPointerException, IllegalArgumentException, and others.
//
// # Note:
//   - Even though it is not mandatory to 'try-catch' runtime exceptions,
//     it is a good idea to still do 'try-catch'.
//   - Because if a runtime exception occurs,
//     the fear is that our program will stop.
//
public class RuntimeExceptionApp {
  public static void main(String[] args) {
    String username = "";
    String password = "";

    ValidationUtility.validateRuntime(username, password);
    System.out.println("Success!");
  }
}
