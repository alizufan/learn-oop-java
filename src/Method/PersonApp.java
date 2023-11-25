package Method;

public class PersonApp {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "Alpha";
    person.address = "London";

    // # Call a Method Person
    person.sayHi("Maya");
  }
}
