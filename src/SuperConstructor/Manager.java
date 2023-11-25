package SuperConstructor;

class Manager {
  String name;

  Manager(String name) {
    this.name = name;
  }

  void sayHi(String to) {
    System.out.printf("Hi %s, My Name is %s\n", to, name);
  }
}
