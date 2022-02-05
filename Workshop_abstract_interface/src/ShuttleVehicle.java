package src;

/**
 * class definition of shuttle Vehicle
 * inheritance from SpaceShip
 * implements from IshuttleShip
 *
 * @author  Daniel Granados
 * @version 1.0.0
 */
abstract class ShuttleVehicle extends SpaceShip implements IshuttleShip{
    protected String typeLoad;
    protected double weightLoad;

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
    public ShuttleVehicle(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String typeLoad, double weightLoad) {
        super(name, country, weight, height, typeFuel, engines, thrust);
        this.typeLoad = typeLoad;
        this.weightLoad = weightLoad;
    }

    /**
     * @see #takeOff() The spaceship take off
     */
    abstract void takeOff();

    /**
     * @see #takeLand() The spaceship take land
     */
    abstract void takeLand();

    /**
     * Override polymorphism
     * Upload the load into the spaceship
     */
    @Override
    public void uploadIntoShip() {
        System.out.println("Se esta subiendo la carga a la lanzadera");
    }

    /**
     * Override polymorphism
     * Load fuel to the spaceship
     */
    @Override
    public void loadFuel() {
        System.out.println("Se esta llenando el tanque con combustible y/o agente oxidante");
    }

    /**
     * Override polymorphism
     * Download the load from the spaceship
     */
    @Override
    public void downloadFromShip() {
        System.out.println("Se esta bajando la carga de la lanzadera");
    }

    /**
     * Override polymorphism
     * Show the attributes of the SpaceShip
     */
    @Override
    void ShowDataSpaceShip() {
        super.ShowDataSpaceShip();
        System.out.println("\tType of Load: " + typeLoad + " - " + " Weight of the Load: " + weightLoad);
    }
}
