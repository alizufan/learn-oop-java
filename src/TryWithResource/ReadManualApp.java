package TryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadManualApp {
  public static void main(String[] args) {

    var filename = "learn-read-text.txt";
    BufferedReader reader = null;

    try{
      reader = new BufferedReader(
              new FileReader(filename)
      );

      while (true) {
        var text = reader.readLine();
        if(text == null) break;
        System.out.println("Text Result: " + text);
      }

    } catch (Throwable throwable) {
      System.out.println("error reading file '"+filename+"': " + throwable.getMessage());

    } finally {
      if(reader != null) {
        try{
          reader.close();
          System.out.println("Success closing a resource: " + filename);
        } catch (IOException e) {
          System.out.println("error closing resource '" + filename + "': " + e.getMessage());
        }
      }
    }

  }
}
