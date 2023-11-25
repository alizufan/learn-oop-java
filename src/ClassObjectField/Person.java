package ClassObjectField;

// # What is Class ?
//   - Class is a blueprint, prototype or mold for creating objects.
//   - Class contains the declaration of all properties and
//     functions owned by the Object.
//   - Every Object is always created from a Class.
//   - And a Class can create unlimited Objects.
//
// # How To Create a Class ?
//   - To create a class, we can use the class keyword.
//   - Normal class naming uses the CamelCase format.
//   - Classname must same with the filename
//
// # Example:
class Person {
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
  // # Example
  String name;
  String address;
  final String country = "England";
}
