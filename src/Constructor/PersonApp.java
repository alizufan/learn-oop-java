package Constructor;

public class PersonApp {
  public static void main(String[] args) {
    // # Use a Method Constructor
    Person person1 = new Person("Alpha", "London");
    Person person2 = new Person("Alpha");
    Person person3 = new Person();

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);
  }
}
