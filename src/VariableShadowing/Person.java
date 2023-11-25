package VariableShadowing;

class Person {
  String name;
  String address;
  final String country = "England";

  // # Variable Shadowing
  //   - Variable shadowing is an incident when we create a variable name with
  //     the same name in the scope that covers the variable with the same name in the scope above it.
  //   - This usually happens when we make the parameter names in the method
  //     the same as the field names in the class.
  //   - When variable shadowing occurs, variables in the scope above automatically
  //     cannot be accessed.
  //
  Person(String name, String address) {
    name = name;
    address = address;
  }
  Person(String name) {
    name = name;
  }
  Person() {
  }

  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is %s, I'm from %s\n", to, name, address);
  }
}
