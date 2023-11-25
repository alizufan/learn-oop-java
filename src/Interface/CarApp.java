package Interface;

// # Interface
//   - Previously we already knew that we could use an abstract class as a contract for its child class.
//   - But actually what is more appropriate for contracts is Interface.
//   - Don't be mistaken that the interface here is not a user interface.
//   - Interfaces are similar to abstract classes, the difference is that in Interfaces,
//     all methods are automatically abstract, they don't have blocks.
//   - In the interface we cannot have fields, we can only have constants (fields that cannot be changed).
//   - To inherit an interface, we don't use the extends keyword, but instead implements.
//
public class CarApp {
  public static void main(String[] args) {
    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();
  }
}
