package Method;

class Person {
  String name;
  String address;
  final String country = "England";

  // # What is Method?
  //   - Apart from adding fields, we can also add methods to objects.
  //   - The method is to declare the method in the class block.
  //   - Just like normal methods, we can also add return values, parameters and methods. overloading the methods in the class block
  //   - To access the method, we can use a period (.) followed by the method name. Same as accessing fields.
  //
  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is %s, I'm from %s\n", to, name, address);
  }
}
