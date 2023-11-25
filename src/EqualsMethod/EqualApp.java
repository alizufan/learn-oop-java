package EqualsMethod;

// # Equals Method
//   - The thing that is a bit confusing in Java is how to compare objects.
//   - In other programming languages, to check whether an object is the same,
//     usually use the == operator, in Java, the == operator is only for checking primitive data
//   - For non-primitive checking, use the equals' method.
//   - And by default, the equal method will compare two objects
//     according to the same position of the object in memory,
//     meaning that if we create 2 objects whose field contents are the same,
//     they are still considered different by the equal method.
//   - Therefore, it is a good idea to override the equals method of the Object class.
//
public class EqualApp {
  public static void main(String[] args) {
    String first = "Yeah";
    first = first + " " + "Boy...";

    String second = "Yeah Boy...";

    // false, why ? because this to check the same allocation object memory.
    System.out.println("first == second: " + (first == second));

    // true, why ? because this method to check a value from two objects.
    // this ideal way to compare a value.
    System.out.println("first.equals(second): " + first.equals(second));

    String third = "Yeah Boy...";

    // true, why ? because the value is same so java optimizes a memory by reference existing object.
    System.out.println("second == third: " + (second == third));

    // true, this ideal way to compare a value.
    System.out.println("second.equals(third): " + second.equals(third));

    Product product = new Product();
    product.setName("Mac");
    product.setPrice(30_000_000);

    Product product2 = new Product();
    product2.setName("Mac");
    product2.setPrice(30_000_000);

    // Test equals method
    System.out.println("product.equals(product2): " + product.equals(product2));
  }
}
