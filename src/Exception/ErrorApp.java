package Exception;

import Exception.Error.DatabaseError;

// # Error
//   - Error is the last type of exception.
//   - Error is a class in Java, which is not recommended for try-catch.
//     Usually errors occur when there is a serious problem,
//     and it is not recommended to try catching them.
//   - That is, it is recommended to turn off the application
//   - For example, if at the start of our application we cannot connect to the database,
//     it is recommended to create an Error type exception and stop the application.
//
// Note:
//   This recommends for fatal error:
//   missed configuration, error datasource (db, redis, etc.)
//
public class ErrorApp {
  public static void main(String[] args) {
    String username = null; //"admin";
    String password = "secret"; //"secret";

    connectDatabase(username, password);
    System.out.println("Success!");
  }

  public static void connectDatabase(String username, String password) {
    if(username == null || password == null) {
      throw new DatabaseError("Can't connect database");
    }
  }
}
