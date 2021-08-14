package CarCollections;

class Comercial extends Vehiculo{
  protected int load;

  public Comercial(String typeVehicle, int passengers, int speed, String licensePlate, int load) {
    super(typeVehicle, passengers, speed, licensePlate);
    this.load = load;
  }
  @Override
  void printDataCar(){
    super.printDataCar();
    System.out.println("\tCarga máxima: " + load + "kg");
  }
}
