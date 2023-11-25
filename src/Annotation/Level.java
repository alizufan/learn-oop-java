package Annotation;

@Fancy(name = "Level", tags = {"application", "java"})
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
