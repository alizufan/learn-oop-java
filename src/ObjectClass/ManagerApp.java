package ObjectClass;

public class ManagerApp {
  public static void main(String[] args) {
    var manager = new Manager();

    // # What is Object Class ?
    //   - In Java, every class we create is automatically an instance of the Object class.
    //   - Even though we don't directly explicitly mention extends Object,
    //     Java will automatically make our class extends Object.
    //   - You could say the Object class is a superclass for all classes in Java.
    //
    // # Explanation:
    //
    //  - You can practice a simple example of an object class by running the println method.
    //    By running the println method you can see that the output from the console displays
    //    the class name and hexadecimal.
    //  - If you open the println method there will be a 'valueOf' method,
    //    well this is a method from the 'String Class' with the input parameter is 'Object Class',
    //    this 'valueOf' method actually calls the 'toString' method which is owned by the 'Object Class'
    //    which produces string value with a format like this '[Package Name.Class Name]@[Hex String Code]'
    //    or '[Class Name]@[Hex String Code]'.
    System.out.println(manager); // Automatic call a 'toString' method.

    //  - So it's actually the same as if we directly called the 'toString' method in the class we created,
    //    here's an example:
    System.out.println(manager.toString());

    // See the result in console, I bet it's a same result, right!.
    // So, everything on 'Object Class' like field and method, we can access or use it.
  }
}
