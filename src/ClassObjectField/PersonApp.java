package ClassObjectField;

public class PersonApp {
  public static void main(String[] args) {
    System.out.println("# What is Object ?");
    // # What is Object ?
    //   - Objects are data that contain fields / properties /
    //     attributes and methods / functions / behavior.
    //   - All non-primitive data in Java are objects, starting from Integers,
    //     Booleans, Characters, Strings and others.
    //
    // # How To Create an Object ?
    //   - An object is the result of the instantiation of a class.
    //   - To create an object we can use the new keyword,
    //     followed by the Class name and brackets ().
    //
    // #  Example:
    var person1 = new Person();
    Person person2 = new Person();
    Person person3;
    person3 = new Person();

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);

    System.out.println("\n# What is Field ?");
    // # What is Field ?
    //   - Fields / Properties / Attributes are data that we can insert into Objects.
    //   - But before we can enter data in fields, we have to declare what data
    //     the object has in its class declaration.
    //   - Creating a field is the same as creating a variable, but placed in
    //     the class block.
    //
    // # How To Manipulate Field ?
    //   - We can manipulate the fields in the object.
    //     Depends on whether it's final or not.
    //   - If it is final, it means we cannot change the data field,
    //     but if not, we can change the field.
    //   - To manipulate field data, the same as with variables.
    //   - To access fields, we need keywords. (dot) after the object name and
    //     followed by the field name.
    //
    // # Example:
    Person person = new Person();
    person.name = "Alpha";
    person.address = "London";

    // # Note - Final field can't be manipulate.
    // person.country = "England";
    System.out.printf(
      "Person Name is %s, Person Address is %s, Person Country is %s \n",
      person.name, person.address, person.country
    );
  }
}
