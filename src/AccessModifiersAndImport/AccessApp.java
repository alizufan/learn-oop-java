package AccessModifiersAndImport;

public class AccessApp {
  // # What is Access Modifiers ?
  //   - Access modifier is the ability to make classes, fields, methods and constructors accessible from anywhere
  //   - Previously, friends have seen 2 access modifiers, namely public and default (no-modifier)
  //   - Now we will discuss other access modifiers
  // # Access Level
  //   - Y = Allowed
  //   - N = Not Allowed
  //
  //   | Modifier    | Class | Package | Subclass | World |
  //   ----------------------------------------------------
  //   | public      |   Y   |    Y    |    Y     |   Y   |
  //   | protected   |   Y   |    Y    |    Y     |   N   |
  //   | no-modifier |   Y   |    Y    |    N     |   N   |
  //   | private     |   Y   |    N    |    N     |   N   |
  //   ----------------------------------------------------
  //
  // # Public Class
  //   - When we create a public class, we can only create 1 public class in 1 Java file
  //   - Additionally, the public class name must be the same as the file name.
  //
  // # What Is Import ?
  //  - Import is the ability to use classes that are in different packages.
  //  - The class requirement that can be used if the packages are different is that the class must be public.
  //
}
