package DefaultMethod;

// # Default Method
//   - Previously we knew that in interfaces,
//     we cannot create concrete methods that have block methods
//   - However, since the Java 8 version,
//     there is a default method feature in the interface.
//   - This feature occurs because it is challenging to maintain an interface contract
//     if there are too many classes that implement the interface.
//   - When we add a method to the interface,
//     automatically all are implementing classes will be damaged
//     because they have to override the method.
//   - By using default methods,
//     we can add concrete methods to the interface.
//
public interface Car extends HasBrand, IsMaintenance {

  void drive();

  int getTier();

  // # default method example
  default boolean isBig() {
    return false;
  }
}
