package CarCollections;

class Vehiculo {
  protected String typeVehicle;
  protected int passengers;
  protected int speed;
  protected String licensePlate;

  public Vehiculo(String typeVehicle, int passengers, int speed, String licensePlate){
    this.typeVehicle = typeVehicle;
    this.passengers = passengers;
    this.speed = speed;
    this.licensePlate = licensePlate;
  }

  void printDataCar(){
    System.out.println("\tVehiculo " + typeVehicle + " - " + " Placa: " + licensePlate);
    System.out.println("\tvelocidad " + speed + " km/h");
    System.out.println("\tpasajeros: " + passengers);
  }

  public String getTypeVehicle() {
    return typeVehicle;
  }
  public void setTypeVehicle(String typeVehicle) {
    this.typeVehicle = typeVehicle;
  }

  public int getPassengers(){
    return passengers;
  }
  public void setPassenger(int passengers){
    this.passengers = passengers;
  }

  public int getSpeed(){
    return speed;
  }
  public void setSpeed(int speed){
    this.speed = speed;
  }

  public String getLicensePlate(){
    return licensePlate;
  }
  public void setLicensePlate(String licensePlate){
    this.licensePlate = licensePlate;
  }
}
