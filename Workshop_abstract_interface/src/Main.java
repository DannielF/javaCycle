package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class
 * The program runs from here
 *
 * @author Daniel Granados
 * @version 1.0.0
 */
public class Main {

    /**
     * Print the info necessary to run the program
     * Instructions
     * name of the ships
     */
    public static void printInfoProgram(){
        System.out.printf("%n"+
                "*** Welcome to crafting spaceships *** %n"+
                "Please follow the instructions below %n"+
                "Write all the attributes of the spaceships separate by a whitespace %n"+
                "option 1 will create a new SpaceShip and option 2 will print the info of each SpaceShip %n"+
                "-------------------- %n"+
                "Basic attributes: %n"+
                "\toption, typeSpaceShip, name, country, weight, height,typeFuel, engines, thrust %n" +
                "If you want to build a shuttleVehicle add this:%n" +
                "\ttypeLoad, weightLoad %n" +
                "If you want to build a UnmannedShip add this:%n" +
                "\ttypeShip, photoVCells, travelSpeed %n" +
                "If you want to build a mannedShip add this:%n" +
                "\tpurpose, capacity, numberOfCrew %n" +
                "Example %n" +
                "\t1 shuttlevehicle SaturnV USA 2900 100 queroseno 3 3500 satellite 500 %n");

    }

    /**
     * Allow you to create new ships
     * The program will run until you stop it
     * Store spaceship data
     * @param args the command line arguments
     */
    public static void main(String[] args){

        class newShuttleVehicle extends ShuttleVehicle{

            /**
             * Constructor for abstract class ShuttleVehicle
             *
             * @param name       Name of the spaceship
             * @param country    what country made the spaceship
             * @param weight     Weight of the spaceship
             * @param height     height of the spaceship
             * @param typeFuel   Type of fuel
             * @param engines    How many engines does it have
             * @param thrust     tons of thrust
             * @param typeLoad   Type of load
             * @param weightLoad Weight of the load
             */
            public newShuttleVehicle(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String typeLoad, double weightLoad) {
                super(name, country, weight, height, typeFuel, engines, thrust, typeLoad, weightLoad);
            }

            @Override
            void takeOff() {
                System.out.println("Shuttle off");
            }

            @Override
            void takeLand() {
                System.out.println("Shuttle land ");
            }

            @Override
            void ShowDataSpaceShip() {
                super.ShowDataSpaceShip();
            }
        }
        class newUnmannedShip extends UnmannedShip{

            /**
             * Constructor for abstract class UnmannedShip
             *
             * @param name        Name of the spaceship
             * @param country     what country made the spaceship
             * @param weight      Weight of the spaceship
             * @param height      height of the spaceship
             * @param typeFuel    Type of fuel
             * @param engines     How many engines does it have
             * @param thrust      tons of thrust
             * @param typeShip    Type of spaceship
             * @param photoVCells Has photovoltaic cells
             * @param travelSpeed Travel speed
             */
            public newUnmannedShip(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String typeShip, boolean photoVCells, double travelSpeed) {
                super(name, country, weight, height, typeFuel, engines, thrust, typeShip, photoVCells, travelSpeed);
            }

            @Override
            public void ShowDataSpaceShip() {
                super.ShowDataSpaceShip();
            }
        }
        class newMannedShip extends MannedShip{

            /**
             * Constructor for abstract class MannedShip
             *
             * @param name         Name of the spaceship
             * @param country      what country made the spaceship
             * @param weight       Weight of the spaceship
             * @param height       height of the spaceship
             * @param typeFuel     Type of fuel
             * @param engines      How many engines does it have
             * @param thrust       tons of thrust
             * @param purpose      What is its purpose
             * @param capacity     How many people can live there
             * @param numberOfCrew Number of crew
             */
            public newMannedShip(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String purpose, int capacity, int numberOfCrew) {
                super(name, country, weight, height, typeFuel, engines, thrust, purpose, capacity, numberOfCrew);
            }
            @Override
            public void ShowDataSpaceShip() {
                super.ShowDataSpaceShip();
            }
        }


        /**
         * The spaceShip info will store here
         * Array the spaceShips
         */
        ArrayList<SpaceShip> spaceShips = new ArrayList<>();


        /**
         * Print the instructions
         */
        printInfoProgram();

        /**
         * Get the user input
         * option - Initialization
         */
        Scanner sc = new Scanner(System.in);
        String option;

        /**
         * Get the user input with sc.nextline()
         * split the user input into the String[]
         * String[] contains the values separate by comma
         */
        do{

            String inputUser = sc.nextLine();
            String[] splitInput = inputUser.split("\\s+");
            option = splitInput[0];

            /**
             * if option is equals to 1 will proceed to create a new spaceShip
             * the other values will be assigned to the right attribute
             */
            if(option.equals("1")){
                String typeSpaceShip = splitInput[1].toLowerCase();
                String name = splitInput[2];
                String country = splitInput[3];
                double weight = Double.parseDouble(splitInput[4]);
                double height = Double.parseDouble(splitInput[5]);
                String typeFuel = splitInput[6];
                int engines = Integer.parseInt(splitInput[7]);
                double thrust = Double.parseDouble(splitInput[8]);

                /**
                 * if the option is 1 and the typeSpaceShip is shuttlevehicle
                 * a new shuttleVehicle will be created
                 * and added to the arrayList the spaceShips
                 */
                if(typeSpaceShip.equals("shuttlevehicle")){
                    String typeLoad = splitInput[9];
                    double weightLoad = Double.parseDouble(splitInput[10]);
                    spaceShips.add(new newShuttleVehicle(name, country, weight, height, typeFuel, engines, thrust, typeLoad, weightLoad) {
                    });
                }

                /**
                 * if the option is 1 and the typeSpaceShip is unmannedship
                 * a new unmannedShip will be created
                 * and added to the arrayList the spaceShips
                 */
                else if(typeSpaceShip.equals("unmannedship")){
                    String typeShip = splitInput[9];
                    boolean photoVCells = Boolean.parseBoolean(splitInput[10]);
                    double travelSpeed = Double.parseDouble(splitInput[11]);
                    spaceShips.add(new newUnmannedShip(name, country, weight, height, typeFuel, engines, thrust, typeShip, photoVCells, travelSpeed) {
                    });
                }

                /**
                 * if the option is 1 and the typeSpaceShip is mannedship
                 * a new mannedShip will be created
                 * and added to the arrayList the spaceShips
                 */
                else if(typeSpaceShip.equals("mannedship")){
                    String purpose = splitInput[9];
                    int capacity = Integer.parseInt(splitInput[10]);
                    int numberOfCrew = Integer.parseInt(splitInput[11]);
                    spaceShips.add(new newMannedShip(name, country, weight, height, typeFuel, engines, thrust, purpose, capacity, numberOfCrew) {
                    });
                }
            }

            /**
             * if the option is 2 the info of each spaceShip will be printed
             */
            else if(option.equals("2")){
                System.out.println("*** SpaceShips Inventory ***");
                for(SpaceShip spaceShip: spaceShips){
                    spaceShip.ShowDataSpaceShip();
                    System.out.printf("%n");
                }
            }
            /**
             * While the option be 1 or 2 the program will be running until you select a different option
              */
        }while (option.equals("1") || option.equals("2"));
    }
}
