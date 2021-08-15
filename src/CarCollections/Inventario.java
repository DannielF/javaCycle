package CarCollections;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
  public static void main(String[] args) throws Exception{
    ArrayList<Vehiculo> vehicles = new ArrayList<>();

    Scanner sc = new Scanner (System.in);
    String option;

    do{
      String n = sc.nextLine();
      String[] chain = n.split("&");
      option = chain[0];
  
  // chain[0: option{1,2,3}][1: typeVehicle][2: passengers][3: speed][4: licensePlate][5: color/load]
      
      if (option.equals("1")){
        String typeVehicle = chain[1];
        int passengers = Integer.parseInt(chain[2]);
        int speed = Integer.parseInt(chain[3]);
        String licensePlate = chain[4];
  
        if(option.equals("1") && typeVehicle.equals("Particular")){
          String color = chain[5];
          vehicles.add(new Particular(typeVehicle, passengers, speed, licensePlate, color));
        }
        else if(option.equals("1") && typeVehicle.equals("Comercial")){
          int load = Integer.parseInt(chain[5]);
          vehicles.add(new Comercial(typeVehicle, passengers, speed, licensePlate, load));
        }
      }
  
      else if(option.equals("2")){
        // print all vehicles
        System.out.println("***Inventario de vehiculos***");
        for(Vehiculo vehicle: vehicles){
          vehicle.printDataCar();
        }
      }
    }while(option.equals("1") || option.equals("2"));
  }
}

// 1&Comercial&2&150&FFF 222&250
// 1&Particular&8&160&EEE 111&Verde 
