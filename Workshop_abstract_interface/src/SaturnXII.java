package src;

/**
 * class definition of SaturnXIII
 * inheritance from ShuttleVehicle
 * implements from IshuttleShip
 *
 * @author  Daniel Granados
 * @version 1.0.0
 */
class SaturnXII extends ShuttleVehicle{

    /**
     * Constructor for class Saturn XIII
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
    public SaturnXII(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String typeLoad, double weightLoad) {
        super(name, country, weight, height, typeFuel, engines, thrust, typeLoad, weightLoad);
    }

    /**
     * Override polymorphism
     * Take off into the space
     */
    @Override
    void takeOff() {
        System.out.println("Despegando hacia el espacio");
    }

    /**
     * Override polymorphism
     * Take land on Earth
     */
    @Override
    void takeLand() {
        System.out.println("Aterizando la nave");
    }

    /**
     * Override polymorphism
     * Upload the cargo into the spaceship
     */
    @Override
    public void uploadIntoShip() {
        System.out.println("Subiendo carga al SaturnXIII !!!");
    }

    /**
     * Override polymorphism
     * Load fuel to the spaceship
     */
    @Override
    public void loadFuel() {
        System.out.println("Cargando combustible");
    }

    /**
     * Override polymorphism
     * Download the cargo from the spaceship
     */
    @Override
    public void downloadFromShip() {
        System.out.println("Bajando la carga del SaturnXIII");
    }

    /**
     * Overload polymorphism
     * Show status of the spaceship
     */
    public void showStatus(){
        System.out.println("Sistemas en línea y todo funcionando");
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
