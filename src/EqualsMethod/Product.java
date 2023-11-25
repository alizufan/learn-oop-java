package EqualsMethod;

import java.util.Objects;

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

  public String toString() {
    return "Name: " + this.name + ", Price: " + this.price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product product = (Product) o;

    if (price != product.price) return false;
    return Objects.equals(name, product.name);
  }

  //  # Manual
  //  public boolean equals(Object o) {
  //    // Check type Object 'o' must Product
  //    if(this == o) return true;
  //    if(!(o instanceof Product product)) return false;
  //
  //    // Check price, this simple because a Primitive type
  //    if(this.price != product.price) return false;
  //
  //    // Check name, this not simple because a Non-Primitive type (Object Type)
  //    // You need to check an object not null
  //    if(this.name != null) {
  //      return this.name.equals(((Product) o).name);
  //    }
  //
  //    return product.name == null;
  //  }
}
