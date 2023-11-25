package ToStringMethod;

public class ProductApp {
  public static void main(String[] args) {
    Product product = new Product();
    product.setName("Mac M1 Pro");
    product.setPrice(20_000_000);

    // Test print out
    System.out.println(product);
  }
}
