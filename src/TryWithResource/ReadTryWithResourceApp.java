package TryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;

// # Try With Resource
//  - In Java 7, there is a new feature called try with resource.
//  - Try with resources is a mechanism to make it easier for us to use resources (which must be closed) in the try block.
//  - If we want to use this feature, we must use the AutoCloseable interface.
//
// # Compare
//   You can compare this code with code in 'ReadManualApp' Class.
//
public class ReadTryWithResourceApp {
  public static void main(String[] args) {
    var filename = "learn-read-text.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
      while (true) {
        var text = reader.readLine();
        if(text == null) break;
        System.out.println("Text Result: " + text);
      }
    } catch (Throwable throwable) {
      System.out.println("error reading file '"+filename+"': " + throwable.getMessage());
    }
  }
}
