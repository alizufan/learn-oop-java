package Annotation;

// # What is Annotation?
//   - Annotation is adding metadata to the program code that we create.
//   - Not everyone needs Annotation, usually Annotation is used
//     when we want to create a library / framework.
//   - Annotations themselves can be accessed using Reflection,
//     which we will discuss later.
//   - To create an annotation, we can use the @interface keyword.
//   - Annotations can only have methods with simple data types,
//     and can have default values.
//
// # Attribute Annotation
//   -----------------------------------------------------------------------------------
//   | Attribute   | Description                                                       |
//   -----------------------------------------------------------------------------------
//   | @Target     | Tell annotation can be used where? Classes, methods, fields, etc. |
//   | @Retention  | Tell whether annotations are stored in the compilation results,   |
//   |             | and whether they can be read by reflection?                       |
//   -----------------------------------------------------------------------------------
//
// # Predefined Annotation
//  Java also has built-in annotations, such as
//   - @Override, to indicate that the method overrides the parent class method.
//   - @Deprecated, to indicate that the method is no longer recommended for use.
//   - @FunctionalInterface, to indicate that the class can be
//     created as a lambda expression and others.
//

@Fancy(name = "AnnotationApp", tags = {"application", "java"})
public class AnnotationApp {
  public static void main(String[] args) {

  }
}
