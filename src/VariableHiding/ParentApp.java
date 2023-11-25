package VariableHiding;

public class ParentApp {
  // # Variable Hiding
  //   - Variable hiding is a problem that occurs when we make the field name the same in
  //     the child class as the field name in the parent class.
  //   - There is no such thing as field overriding, when we recreate the field name in the class,
  //     it means variable hiding.
  //   - To overcome variable hiding, we can use the super keyword.
  //   - What differentiates variable hiding and method overriding is when an object is cast.
  //   - When an object is cast, the method will still access the overriding method,
  //     but the variable will access the variables in its class.
  //
  public static void main(String[] args) {
    // # Variable Hiding vs Method Overriding
    Child child = new Child();
    child.name = "June";
    child.doIt();
    System.out.println(child.name);

    // # The Problem !
    //   When running the 'doIt' method, why does the output go to the child and
    //   not to the parent even though it has been cast,
    //   the answer is because we are using an object from the Child
    //   so what is accessed by the parent variable is the overriding method from the child,
    //   not the parent.
    //
    // # The Solution !
    //   So how ? the answer must be to create a new parent object with 'new Parent()'.
    //
    Parent parent = (Parent) child;
    parent.doIt();
    System.out.println(parent.name);
  }
}
