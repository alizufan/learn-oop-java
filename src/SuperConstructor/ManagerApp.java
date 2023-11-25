package SuperConstructor;

public class ManagerApp {
  public static void main(String[] args) {
    // Test to Call Method
    var manager = new Manager("Harry");
    manager.sayHi("Clarisa");

    var vicePresident = new VicePresident("Mei");
    vicePresident.sayHi("Caca");
  }
}
