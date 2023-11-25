package Exception;

// # Stack Trace Element Class
//   - Throwable has a method called getStackTrace(),
//     which produces an Array of StackTraceElement objects.
//   - StackTraceElement contains information about the class,
//     file and even the line where the error occurred.
//   - This StackTraceElement class is very important for tracing
//     the location of the error that occurred.
//   - The easiest way, we can call the printStackTrace() method of the Throwable class,
//     to print to the console the details of the StackTraceElement error.
//
public class StackTraceElementApp {
  public static void main(String[] args) {
    try {
      String[] names = {"August", "September", "October"};

      System.out.println(names[30]);
    } catch (Throwable throwable) {
      StackTraceElement[] stackTraces = throwable.getStackTrace();
      throwable.printStackTrace();
    }

    try {
      sampleError();
    } catch (RuntimeException exception) {
      exception.printStackTrace();
    }
  }

  public static void sampleError() {
    try {
      String[] names = {"August", "September", "October"};

      System.out.println(names[50]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }
}
