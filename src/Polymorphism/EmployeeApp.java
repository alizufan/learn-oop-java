package Polymorphism;

class EmployeeApp {
  public static void main(String[] args) {
    // # What is Polymorphism ?
    //   - Polymorphism comes from Greek which means many forms.
    //   - In OOP, Polymorphism is the ability of an object to change form into another form.
    //   - Polymorphism is closely related to Inheritance.
    //

    Employee employee = new Employee("April");
    employee.sayHi("June");

    employee = new Manager("August");
    employee.sayHi("September");

    employee = new VicePresident("November");
    employee.sayHi("December");

    System.out.println();
    sayHello(new Employee("April"));
    sayHello(new Manager("August"));
    sayHello(new VicePresident("November"));
  }

  // # Method Polymorphism
  static void sayHello(Employee employee) {
    System.out.printf("Hello %s, Nice to meet you !\n", employee.name);
  }
}
