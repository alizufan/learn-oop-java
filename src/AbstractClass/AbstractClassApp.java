package AbstractClass;

public class AbstractClassApp {
  public static void main(String[] args) {
    // it will error
    // var location = new Location();
    var city = new City();
    city.name = "Kediri";

    System.out.println(city.name);
  }
}
