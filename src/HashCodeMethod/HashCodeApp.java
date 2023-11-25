package HashCodeMethod;

// # Hash Code Method
//   - The hashCode method is a method for representing our integer object,
//     similar to toString which is a String representation, hashCode is an integer representation.
//   - HashCode is beneficial for creating unique data structures such as HashMap, Set, etc.,
//     because it is enough to use the hashCode method to get the identity of our unique object.
//   - By default, hashCode will return an integer value according to the data in memory,
//     but we can override it if we want.
//
// # Contract Hash Code
//   It is not easy to override the hashCode method, because there is a contract:
//     - No matter how many times the hashCode is called, for the same object,
//       it must produce the same integer data.
//     - If there are 2 objects that are the same when compared using the equal method,
//       then their hashCode values must also be the same.
//     - It is not necessary to have a different hashCode if the equal method produces false,
//       because the number of integers is limited to around 2 billion.
//
public class HashCodeApp {
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

    // Test hash code method
    System.out.println("product.hashCode() == product2.hashCode(): " + (product.hashCode() == product2.hashCode()));
  }
}
