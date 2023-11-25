package Constructor;

class Person {
  String name;
  String address;
  final String country = "England";

  // # What is Constructor ?
  //   - When we create an Object, it is like we are calling a method,
  //     because we use brackets ().
  //   - In Java classes, we can create constructors,
  //     constructors are methods that will be called the first time an object is created.
  //   - Similar to methods, we can give parameters to the constructor.
  //   - The constructor name must be the same as the class name,
  //     and does not require the void or return value keywords.
  //
  // #  What is Constructor Overloading ?
  //   - Just like in methods, in constructors we can also do overloading.
  //   - We can create more than one constructor, provided that the parameter data type must be different, or the number of parameters must be different.
  //
  // # Example Method Constructor And Constructor Overloading With 2 Parameter
  Person(String setName, String setAddress) {
    name = setName;
    address = setAddress;
  }

  // # Example Method Constructor And Constructor Overloading With 1 Parameter
  Person(String setName) {
    name = setName;
  }

  // # Example Method Constructor And Constructor Overloading With No Parameter
  Person() {
  }

  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is %s, I'm from %s\n", to, name, address);
  }
}
