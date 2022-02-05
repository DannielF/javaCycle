package src;

/**
 *  class definition of Apolo II
 *  inheritance from MannedShip
 *  implements from ImannedShip
 *
 *  @author  Daniel Granados
 *  @version 1.0.0
 */
class ApoloII extends MannedShip{

    /**
     *constructor for class Apolo II
     *
     * @param name          Name of the spaceship
     * @param country       what country made the spaceship
     * @param weight        Weight of the spaceship
     * @param height        height of the spaceship
     * @param typeFuel      Type of fuel
     * @param engines       How many engines does it have
     * @param thrust        tons of thrust
     * @param purpose       What is its purpose
     * @param capacity      How many people can live there
     * @param numberOfCrew  Number of crew
     */
    public ApoloII(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String purpose, int capacity, int numberOfCrew) {
        super(name, country, weight, height, typeFuel, engines, thrust, purpose, capacity, numberOfCrew);
    }

    /**
     * Override polymorphism
     * Start a new research
     */
    @Override
    public void StartResearch() {
        super.StartResearch();
    }

    /**
     * Override polymorphism
     * Executes a maintenance task
     */
    @Override
    public void executeMaintenance() {
        super.executeMaintenance();
    }

    /**
     * Override polymorphism
     * Executes a repair task
     */
    @Override
    public void executeRepair() {
        super.executeRepair();
    }

    /**
     * Override polymorphism
     * Executes a coupling with the ISS
     */
    @Override
    public void executeCoupling() {
        System.out.println("Acoplando con la Estación Espacial Internacional");
    }

    /**
     * Override polymorphism
     * Executes evasive maneuvers, if you do not want to crash
     */
    @Override
    public void evasiveManeuvers() {
        super.evasiveManeuvers();
    }

    /**
     * Overload polymorphism
     * Turn on the autopilot in the space, don't try it on the Earth
     */
    public void turnOnAutopilot(){
        System.out.println("Piloto automático activado");
    }

    /**
     * Override polymorphism
     * Show the attributes of the SpaceShip
     */
    @Override
    void ShowDataSpaceShip() {
        super.ShowDataSpaceShip();
    }
}
