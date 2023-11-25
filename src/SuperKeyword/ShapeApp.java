package SuperKeyword;

public class ShapeApp {
  public static void main(String[] args) {
    // Test to Call Method
    var rect = new Rectangle();
    System.out.printf("Rectangle Corner: %s\n", rect.getCorner());
    System.out.printf("Rectangle Parent Corner: %s\n",rect.getParentCorner());
  }
}
