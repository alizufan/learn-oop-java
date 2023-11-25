package EnumClass;

// # Enum Members
//   - Just like normal classes,
//     in the enum class we can also add members (fields, methods, and constructors).
//   - Specifically for constructors, we cannot create public constructors
//     because the purpose of enums is not to be instantiated freely.
//
public enum Level {
  STANDARD("Standard Edition"),
  PREMIUM("Premium Edition"),
  VIP("VIP Edition");

  private String description;

  Level(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }
}
