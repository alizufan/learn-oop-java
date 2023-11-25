package AnonymousClass;

// # Anonymous Class
//   - Anonymous class or class without a name.
//   - Is the ability to declare a class,
//     as well as instantiate its object directly.
//   - Anonymous class is actually an inner class,
//     where the outer class is where we create the anonymous class.
//   - Anonymous classes are very suitable when we are faced with
//     the case of creating a simple implementation of an interface or abstract class,
//     without having to create a class implementation.
//
public class HelloWorldApp {
  public static void main(String[] args) {
    HelloWorld english = new HelloWorld() {
      public void sayHello() {
        System.out.println("Hello");
      }

      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    // Note:
    //  - You can use it again, so you need repeat.
    HelloWorld spanish = new HelloWorld() {
      public void sayHello() {
        System.out.println("Hola");
      }

      public void sayHello(String name) {
        System.out.println("Hola " + name);
      }
    };

    english.sayHello();
    english.sayHello("June");

    System.out.println();

    spanish.sayHello();
    spanish.sayHello("July");
  }
}
