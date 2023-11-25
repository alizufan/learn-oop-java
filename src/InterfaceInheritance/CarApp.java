package InterfaceInheritance;

// # Interface Inheritance
//   - Previously we already knew that in Java, a child class can only have 1 parent class.
//   - However, unlike interfaces, a child class can implement more than 1 interface.
//   - Even interfaces can implement other interfaces, there can be more than 1.
//     However, if an interface wants to inherit another interface,
//     we use the extends keyword, not implements.
//
public class CarApp {
  public static void main(String[] args) {
    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();
  }
}
