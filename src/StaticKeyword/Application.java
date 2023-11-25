package StaticKeyword;

public class Application {
  public static final int PROCESSORS;

  static {
    System.out.println("Access Application Class");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }
}
