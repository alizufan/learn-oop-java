package Polymorphism;

class VicePresident extends Manager {
  VicePresident(String name) {
    super(name);
  }

  void sayHi(String to) {
    System.out.println("Hi "+ to + ", My Name is VP "+ this.name);
  }
}
