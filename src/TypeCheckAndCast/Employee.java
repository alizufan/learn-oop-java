package TypeCheckAndCast;

class Employee {
  String name;
  Employee(String name) {
    this.name = name;
  }

  void sayHi(String to) {
    System.out.println("Hi "+ to + ", My Name is Employee "+ this.name);
  }
}
