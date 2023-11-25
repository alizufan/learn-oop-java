package EnumClass;

import java.util.Arrays;

// # Enum Class
//   - When we create applications,
//     sometimes we will encounter types of data that have limited value.
//   - For example, gender,
//     there are male and female, or customer type,
//     there are standard, premium or VIP, and so on.
//   - In cases like this,
//     we can use an enum class,
//     which is a class that contains predetermined limited values.
//   - When creating an enum class,
//     it will automatically extend the java.lang.Enum class,
//     therefore the enum class cannot extend other classes,
//     but can still implement interfaces.
//
public class EnumApp {
  public static void main(String[] args) {
    var customer = new Customer();
    customer.setName("August");
    customer.setLevel(Level.VIP);

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());
    System.out.println(customer.getLevel().getDescription());

    // # Conversion Enum
    // - To String
    String levelString = Level.PREMIUM.name();
    // - To Enum
    Level level = Level.valueOf("STANDARD");
    // - To Array of Enum
    Level[] levelValues = Level.values();

    System.out.println();

    System.out.println(levelString);
    System.out.println(level);
    // a bit of difference, but yeah to show array baby!
    System.out.println(Arrays.toString(levelValues));
  }
}
