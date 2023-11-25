package DefaultMethod;

public class Avanza implements Car {
  public void drive() {
    System.out.println("Drive Avanza!");
  }

  public int getTier() {
    return 4;
  }

  public String getBrand() {
    return "Toyota";
  }

  public boolean isMaintenance() {
    return false;
  }
}
