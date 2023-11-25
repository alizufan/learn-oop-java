package MethodOverriding;

class Manager {
  String name;

  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is Manager %s\n", to, this.name);
  }
}
