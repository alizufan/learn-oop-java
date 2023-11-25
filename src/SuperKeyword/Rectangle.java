package SuperKeyword;

class Rectangle extends Shape {
  int getCorner() {
    return 4;
  }

  // # What Is Super Keyword ?
  //   - Sometimes we want to access methods in the parent class that we have already overridden in the child class.
  //   - To access methods belonging to the parent class, we can use the super keyword.
  //   - Simply put, super is used to access the parent class.
  //   - Not only methods, we can also access fields belonging to the parent class using the super keyword.
  //
  int getParentCorner() {
    return super.getCorner();
  }
}
