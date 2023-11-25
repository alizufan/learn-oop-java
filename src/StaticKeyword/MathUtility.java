package StaticKeyword;

public class MathUtility {
  // # Static Method
  public static int sum(int... values) {
    int total = 0;
    for (var value:values) {
      total += value;
    }
    return total;
  }
}
