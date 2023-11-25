package StaticKeyword;

// # Static Keyword
//   - Previously we have often seen the static keyword,
//     but we have never discussed it.
//   - By using the static keyword, we can make fields,
//     methods or classes accessible directly without going through the object.
//   - Please remember, static can only access another static.
//
// # Static Can Be Used
//   - Field, or what is called a class variable,
//     means that the field can be accessed directly without creating an object first.
//   - Method, or what is called a class method,
//     means that the method can be accessed directly without creating an object first.
//   - Block, static block will automatically be executed when a class is loaded.
//   - Inner Class, meaning that the inner class can be accessed directly
//     without having to create an outer class object first.
//     Static in the inner class means we can no longer access the outer class object.
//
// # Static Import
// import static Util.Math.*;
//
// import static Util.Math.PHI;
//  You can directly use like this: System.out.println(PHI);

public class StaticApp {
  public static void main(String[] args) {
    // # Test Static Field
    System.out.println(Constant.APPLICATION);
    System.out.println(Constant.VERSION);

    System.out.println();

    // # Test Static Method
    System.out.println(MathUtility.sum(1,2,3,4,5));

    System.out.println();

    // # Test Static Inner Class
    Country.City city = new Country.City();
    city.setName("Kediri");
    System.out.println(city.getName());

    System.out.println();

    // # Test Static Block
    System.out.println(Application.PROCESSORS);
  }
}
