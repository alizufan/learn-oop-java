package ToStringMethod;

public class Product {
  private String name;
  private int price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  // # ToString Method
  //   - toString() is a method in the Object class.
  //   - This method is usually used to represent objects in String form.
  //   - By default, toString() will produce: className + @ + hashCode
  //   - However, we can change it if we want,
  //     so that the objects we create are easier to read.
  //
  public String toString() {
    return "Name: " + this.name + ", Price: " + this.price;
  }
}
