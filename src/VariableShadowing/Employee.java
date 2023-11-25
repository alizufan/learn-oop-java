package VariableShadowing;

class Employee {
  String name;
  String address;
  final String country = "England";

  // # How To Solve Variable Shadowing ?
  //   - Use a 'this' Keyword, to access the current object.
  //
  // # What is 'this' keyword ?
  //   - When we code in a block constructor or method in a class,
  //     we can use the 'this' keyword to access the current object.
  //   - For example, sometimes we need to access a field whose name is
  //     the same as a method parameter, this cannot be done if we directly mention
  //     the field name, we can access the field name with the 'this' keyword.
  //   - This is not only used to access the current object's fields,
  //     but can also be used to access methods.
  //   - This can be used to overcome variable shadowing problems.
  //
  Employee(String name, String address) {
    this.name = name;
    this.address = address;
  }
  Employee(String name) {
    this.name = name;
  }
  Employee() {
  }

  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is %s, I'm from %s\n", to, this.name, this.address);
  }
}
