package AccessModifiersAndImport.Learn.SecondNested;

// # What Is Import ?
//  - Import is the ability to use classes that are in different packages.
//  - The class requirement that can be used if the packages are different is that the class must be 'public'.
//
// # Import All Package
//  - If we want to import all classes in a package, we can use the * sign,
//    for example: import package.parent.child.*
//
// # Example:
//   - import AccessModifiersAndImport.Learn.FirstNested.*;
//
// # Default Import
//  - By default, all classes in the java.lang package are automatically imported,
//    so we don't need to import them manually.
//  - Examples of String, Integer, Long, Boolean, and other classes are found in the java.lang package.
//    Therefore, we don't need to import it manually.
//
// # Example you don't need doing this, because it's default:
//   - import java.lang.*;
//
import AccessModifiersAndImport.Learn.FirstNested.First;

public class SecondApp {
  public static void main(String[] args) {
    First first = new First("Indomie", 3_000);
    System.out.println(first.name);
    System.out.println(first.price);
  }
}
