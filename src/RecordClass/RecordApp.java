package RecordClass;

// # Record Class
//
//  @ Java Experimental Feature
//   - This feature is still in the preview version and
//     is not yet stable in the Java version,
//     but we can try it.
//   - But please remember, because this feature is still experimental,
//     meaning there is no guarantee that in future versions of Java,
//     this feature will still be there, it could be removed.
//
//  @ What is Record Class?
//   - Sometimes we often create classes, only for classes that contain data.
//     Only contains getters, equals, hashCode, and toString methods
//   - Class records are used to make it easier to create this type of class.
//     When we create a record class, Java will automatically create getters,
//     equals, hashCode and toString methods automatically, and also a constructor automatically.
//   - When creating a record class, we will automatically extend the java.lang.Record class,
//     which means we cannot extend other classes. However,
//     we can still implement the interface.
//
// # Note:
//   Because this is an experimental feature you need to activate manually.
//   - Go to 'File' -> Project Structure -> Modules -> Language Level
//     -> Select Java 16 -> Apply -> OK;
//
// # Record Class Constructor
//   - By default, the constructor in the record class will be created automatically,
//     according to the definition of the record class parameters.
//   - However, if we want to do something in the constructor,
//     we can create a compact constructor,
//     namely a constructor without the sign ().
//   - Apart from that, we can also do constructor overloading,
//     but there are conditions, namely that the overloading constructor must still call
//     the main constructor which is automatically created in the class record.
//
public class RecordApp {
  public static void main(String[] args) {
    var loginRequest = new LoginRequest("June", "secret");
    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    System.out.println(loginRequest);

    System.out.println();
    loginRequest.sayHi();

    System.out.println();
    System.out.println(new LoginRequest());

    System.out.println();
    System.out.println(new LoginRequest("August"));

    System.out.println();
    System.out.println(new LoginRequest("November", "secret"));
  }
}
