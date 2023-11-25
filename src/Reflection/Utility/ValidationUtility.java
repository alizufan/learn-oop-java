package Reflection.Utility;

import Reflection.Annotation.NotBlank;
import Reflection.Error.BlankException;

import java.lang.reflect.Field;

public class ValidationUtility {
  public static void validationReflection(Object object) {
    var aClass = object.getClass();
    Field[] fields = aClass.getDeclaredFields();

    for(var field: fields) {
      field.setAccessible(true);
      if(field.getAnnotation(NotBlank.class) != null) {
        // validated
        try {

          String value = (String) field.get(object);
          if(value == null || value.isBlank()) {
            throw new BlankException("field " + field.getName() + " is blank.");
          }

        } catch (IllegalAccessException exception) {
          System.out.println("Can't access field: "+ field.getName());
        }

      }
    }

  }
}
