package MethodOverriding;

public class ManagerApp {
  public static void main(String[] args) {
    // # Test Method Overriding
    var manager = new Manager();
    manager.name = "Harry";
    manager.sayHi("Clarisa");

    var vicePresident = new VicePresident();
    vicePresident.name = "Mei";
    vicePresident.sayHi("Caca");
  }
}
