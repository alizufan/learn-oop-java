package Exception.Utility;

import Exception.Error.BlankException;
import Exception.Error.ValidationException;

public class ValidationUtility {
  public static void validate(String username, String password) throws ValidationException, NullPointerException {
    if(username == null) {
      throw new NullPointerException("username is null");
    } else if(username.isBlank()) {
      throw new ValidationException("username is blank");
    } else if(password == null) {
      throw new NullPointerException("password is null");
    } else if(password.isBlank()) {
      throw new ValidationException("password is blank");
    }
  }

  // You are not obliged to add the 'throws' keyword to the method,
  // because this is a RuntimeException.
  public static void validateRuntime(String username, String password) {
    if(username == null) {
      throw new NullPointerException("username is null");
    } else if(username.isBlank()) {
      throw new BlankException("username is blank");
    } else if(password == null) {
      throw new NullPointerException("password is null");
    } else if(password.isBlank()) {
      throw new BlankException("password is blank");
    }
  }
}
