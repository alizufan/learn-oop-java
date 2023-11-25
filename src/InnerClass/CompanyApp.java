package InnerClass;

// # Inner Class
//   - In Java, we can create classes within classes,
//     or what are called Inner Classes.
//   - One of the cases when we create an inner class is usually
//     when we need to create several interconnected classes,
//     where a class cannot be created without another class.
//   - For example, if we need to create an Employee class, which requires a Company class,
//     then we can create an Employee class as an inner Company class.
//   - How to create an inner class, create it in the outer class block.
//
// # Accessing Outer Class
//   - The advantage when we create an inner class is the ability to access the outer class.
//   - The inner class can read all private members in the outer class.
//   - To access the outer class object, we can use the name of the outer class
//     followed by the keyword this, for example 'Company.this'.
//   - And to access the outer class superclass,
//     we can use the outer class name followed by the super keyword,
//     for example 'Company.super'.
//
public class CompanyApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Java.co.id");

    Company.Employee employee = company.new Employee();
    employee.setName("Lala");

    System.out.println("Employee 1 Name : " + employee.getName());
    System.out.println("Company 1 Name  : " + employee.getCompany());

    System.out.println();

    Company company2 = new Company();
    company2.setName("OOP.co.id");

    Company.Employee employee2 = company2.new Employee();
    employee2.setName("Nana");

    System.out.println("Employee 2 Name : " + employee2.getName());
    System.out.println("Company 2 Name  : " + employee2.getCompany());
  }
}
