package Constructor;

class Employee {
  String name;
  String address;
  final String country = "England";

  // # How To Call Other Constructor ?
  //   - Constructors can call other constructors
  //   - This makes it easier when we need to initialize data with various possibilities
  //   - The way to call another constructor, we only need to call it like calling a method,
  //     but with the 'this' keyword.
  //
  Employee(String setName, String setAddress) {
    name = setName;
    address = setAddress;
  }
  Employee(String setName) {
    this(setName, null);
  }
  Employee() {
    this(null);
  }

  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is %s, I'm from %s\n", to, name, address);
  }
}
