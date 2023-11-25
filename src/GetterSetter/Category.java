package GetterSetter;

public class Category {
  // # Getter And Setter
  //
  // @ Encapsulation
  //   - Encapsulation means ensuring that an object's sensitive data is hidden from outside access.
  //   - This aims to ensure that the data of an object remains good and valid.
  //   - To achieve this, we will usually make all fields use the access modifier private, so they cannot be accessed or changed from outside.
  //   - So that it can be changed, we will provide a method to change and get the field.
  //
  // @ Getter and Setter
  //   - In Java, the encapsulation process has been standardized, where we can use the -Getter and Setter methods.
  //   - Getter is a function created to retrieve field data.
  //   - Setter is a function to change field data.
  //
  // @ Best Practice Getter and Setter Method Naming
  //
  //   -----------------------------------------------------
  //   | Type Data | Getter Method |     Setter Method     |
  //   -----------------------------------------------------
  //   | boolean   |    isXxx()    | setXxx(boolean value) |
  //   | Primitive |    getXxx()   | setXxx(boolean value) |
  //   | Object    |    getXxx()   | setXxx(boolean value) |
  //   -----------------------------------------------------
  //
  // # Tips:
  //   if you using IntelliJ IDEA Ultimate you can generate a Getter and Setter, go to:
  //    - Menu Code -> Generate -> Select Getter Setter -> Select your private field -> OK
  //
  private String id;
  private boolean expensive;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    // validation input data
    if(id != null) {
      this.id = id;
    }
  }

  public boolean isExpensive() {
    return expensive;
  }

  public void setExpensive(boolean expensive) {
    this.expensive = expensive;
  }
}
