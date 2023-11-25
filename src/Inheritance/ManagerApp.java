package Inheritance;

public class ManagerApp {
  public static void main(String[] args) {
    var manager = new Manager();
    manager.name = "Harry";
    manager.sayHi("Clarisa");

    // Call Inheritance
    var vicePresident = new VicePresident();
    vicePresident.name = "Mei";
    vicePresident.sayHi("Caca");
  }
}
