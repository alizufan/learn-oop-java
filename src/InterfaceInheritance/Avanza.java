package InterfaceInheritance;

// You can directly add on this class
// with comma ex. 'Avanza implements Car, IsMaintenance'
// or in interface 'Car' ex. 'Car extends HasBrand, IsMaintenance'
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
