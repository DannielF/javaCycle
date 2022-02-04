package src;

/**
 *  class definition of Manned spaceship
 *  inheritance from SpaceShip
 *  implements from ImannedShip
 *
 *  @author  Daniel Granados
 *  @version 1.0.0
 */
abstract class MannedShip extends SpaceShip implements ImannedShip{
    protected String purpose;
    protected int capacity;
    protected int numberOfCrew;

    /**
     * Constructor for abstract class MannedShip
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
    public MannedShip(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String purpose, int capacity, int numberOfCrew) {
        super(name, country, weight, height, typeFuel, engines, thrust);
        this.purpose = purpose;
        this.capacity = capacity;
        this.numberOfCrew = numberOfCrew;
    }

    /**
     * Override polymorphism
     * Start a new research
     */
    @Override
    public void StartResearch() {
        System.out.println("Investigación iniciada");
    }

    /**
     * Override polymorphism
     * Executes a maintenance task
     */
    @Override
    public void executeMaintenance() {
        System.out.println("Ejecutando mantenimiento a la nave");
    }

    /**
     * Override polymorphism
     * Executes a repair task
     */
    @Override
    public void executeRepair() {
        System.out.println("Ejecutando reparación a la nave");
    }

    /**
     * Override polymorphism
     * Executes a coupling
     */
    @Override
    public void executeCoupling() {
        System.out.println("Ejecutando acoplamiento con otra nave");
    }

    /**
     * Override polymorphism
     * Executes evasive maneuvers, if you do not want to crash
     */
    @Override
    public void evasiveManeuvers() {
        System.out.println("Ejecutando maniobras evasivas");
    }
}
