package AccessModifiersAndImport.Learn.FirstNested;

// # Public Class
//   - When we create a public class, we can only create 1 public class in 1 Java file
//   - Additionally, the public class name must be the same as the file name.
//
public class First {

  public String name;
  public int price;

  // When we set a field to 'protected', we can only access it in
  // package 'AccessModifiers.Learn.FirstNested' and class inheritance .
  // This will cause error when you access it in other package.
  //
  // protected String name;
  // protected int price;

  // This will cause error when you access it in other class
  //
  // private String name;
  // private int price;

  // Keep in mind you have to change the constructor to public too.
  public First(String name, int price) {
    this.name = name;
    this.price = price;
  }
}
