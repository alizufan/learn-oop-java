package TypeCheckAndCast;

class EmployeeApp {
  public static void main(String[] args) {
    // # What is Type Check & Casts ?
    //   - Previously we already knew how to convert data types (casts) to primitive data types
    //   - Casts can also be used for non-primitive data types.
    //   - However, to be safe, before doing casts, make sure we do a type check (data type checking), using the 'instanceof' keyword.
    //   - The result of the instanceof operator is a boolean, true if the data type matches, false if it does not.
    //

    System.out.println();
    sayHello(new Employee("April"));
    sayHello(new Manager("August"));
    sayHello(new VicePresident("November"));

    System.out.println();
    sayHi(new Employee("April"));
    sayHi(new Manager("August"));
    sayHi(new VicePresident("November"));
  }

  // # Method Polymorphism
  static void sayHello(Employee employee) {
    // Type Check
    if(employee instanceof VicePresident) {
      // Type Casts
      VicePresident vicePresident = (VicePresident) employee;
      System.out.printf("Hello VP %s!\n", vicePresident.name);

      // Type Check
    } else if(employee instanceof Manager) {
      // Type Casts
      Manager manager = (Manager) employee;
      System.out.printf("Hello VP %s!\n", manager.name);

    } else {
      System.out.printf("Hello %s!\n", employee.name);
    }
  }

  //
  static void sayHi(Employee employee) {
    // Type Check and Casts
    if(employee instanceof VicePresident vicePresident) {
      System.out.printf("Hi VP %s!\n", vicePresident.name);

      // Type Check and Casts
    } else if(employee instanceof Manager manager) {
      System.out.printf("Hi VP %s!\n", manager.name);

    } else {
      System.out.printf("Hi %s!\n", employee.name);
    }
  }
}
