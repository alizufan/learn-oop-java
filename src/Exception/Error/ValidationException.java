package Exception.Error;

public class ValidationException extends Throwable {
  // You don't need to create manually,
  // because the exception message in parent class is already implemented.
  // You need to send a message to super constructor.
  public ValidationException(String message) {
    super(message);
  }
}
