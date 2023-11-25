package InterfaceInheritance;

// You can directly add on class 'Avanza'
// with comma ex. 'Avanza implements Car, IsMaintenance'
// or in interface 'Car' ex. 'Car extends HasBrand, IsMaintenance'
public interface Car extends HasBrand, IsMaintenance {

  void drive();

  int getTier();
}
