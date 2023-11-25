package TypeCheckAndCast;

class Manager extends Employee {
  Manager(String name) {
    super(name);
  }

  void sayHi(String to) {
    System.out.println("Hi "+ to + ", My Name is Manager "+ this.name);
  }
}
