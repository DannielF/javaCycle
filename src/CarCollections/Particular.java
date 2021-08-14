package CarCollections;

class Particular extends Vehiculo {
  protected String color;

  public Particular(String typeVehicle, int passengers, int speed, String licensePlate, String color) {
    super(typeVehicle, passengers, speed, licensePlate);
    this.color = color;
  }
  @Override
  void printDataCar(){
    super.printDataCar();
    System.out.println("\tcolor: " + color);
  }
}
