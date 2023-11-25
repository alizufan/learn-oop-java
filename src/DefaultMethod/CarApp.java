package DefaultMethod;

public class CarApp {
  public static void main(String[] args) {
    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();

    // Default Method Example:
    System.out.println(car.isBig());
  }
}
