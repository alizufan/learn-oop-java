package MethodOverriding;

// # What is Method Overriding ?
//   - Method overriding is the ability to redeclare methods in the child class,
//     which already exist in the parent class.
//   - When we carry out the overriding process, automatically when we create an object
//     from the child class, the methods in the parent class can no longer be accessed.
//
class VicePresident extends Manager {

  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is VP %s\n", to, this.name);
  }
}
