package Exception;

import Exception.Error.ValidationException;
import Exception.Utility.ValidationUtility;

public class CatchMultipleExceptionApp {
  public static void main(String[] args) {
    String username = null; // "August";
    String password = null; // "secret";

    try {
      ValidationUtility.validate(username, password);
      System.out.println("Data valid!");
    } catch (ValidationException | NullPointerException e) {
      System.out.println("Data isn't valid: " + e.getMessage());
    } finally {
      System.out.println("Always Executed: Your Try Catch Complete");
    }
  }
}
