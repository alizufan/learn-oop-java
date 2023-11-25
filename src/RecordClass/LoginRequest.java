package RecordClass;

// # Rules:
//   - You can only 'implements' an interfaces
//   - You can't 'extends' a classes in this record class.
//   - You can't modify data from this class, because all data is 'final' in this class.
//   - etc.
//
public record LoginRequest(String username, String password) {
  // # Record Class Constructor Example
  public LoginRequest {
    System.out.println("creating an object login request");
  }

  // # Record Class Constructor Overloading With One Parameter Example
  public LoginRequest(String username) {
    this(username, null);
  }

  // # Record Class Constructor Overloading No Parameter Example
  public LoginRequest() {
    this(null, null);
  }

  // # Can I create a method?
  //   Yes, you can just as usual you create a method.
  //
  public void sayHi() {
    System.out.println("Hi " + this.username);
  }
}
