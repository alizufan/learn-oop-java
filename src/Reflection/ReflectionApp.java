package Reflection;

import Reflection.Request.CreateUserRequest;
import Reflection.Utility.ValidationUtility;

// # Reflection
//   - Reflection is the ability to see the structure
//     of our application while it is running.
//   - Reflection is usually beneficial when we want to create a library or framework,
//     so we can automate work.
//   - To access the reflection class of an object, we can use the getClass() or
//     NamaClass.class method.
//
// # Note
//   - Reflection is a very long material.
//   - Therefore, the Java Reflection material
//     will be made into a separate course.
//
public class ReflectionApp {
  public static void main(String[] args) {
    var createUserRequest = new CreateUserRequest();
    createUserRequest.setUsername("August");
    createUserRequest.setPassword("secret");

    // # Test an Error validation from Annotation 'NotBlank'.
    // createUserRequest.setName("August Destiny");

    ValidationUtility.validationReflection(createUserRequest);
  }
}
