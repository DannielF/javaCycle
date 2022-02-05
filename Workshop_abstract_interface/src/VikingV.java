package src;

/**
 *  class definition of Viking V
 *  inheritance from UnmannedShip
 *  implements from IunmannedShip
 *
 *  @author  Daniel Granados
 *  @version 1.0.0
 */
class VikingV extends UnmannedShip {

    /**
     * Constructor for class Viking V
     *
     * @param name         Name of the spaceship
     * @param country      what country made the spaceship
     * @param weight       Weight of the spaceship
     * @param height       height of the spaceship
     * @param typeFuel     Type of fuel
     * @param engines      How many engines does it have
     * @param thrust       tons of thrust
     * @param typeShip     Type of spaceship
     * @param photoVCells  Has photovoltaic cells
     * @param travelSpeed  Travel speed
     */
    public VikingV(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String typeShip, boolean photoVCells, double travelSpeed) {
        super(name, country, weight, height, typeFuel, engines, thrust, typeShip, photoVCells, travelSpeed);
    }

    /**
     * Override polymorphism
     * Take a picture of the space
     */
    @Override
    public void takePictureSpace() {
        super.takePictureSpace();
    }

    /**
     * Override polymorphism
     * Study a celestial object like Moon or another stars
     */
    @Override
    public void studyCelestialObject() {
        super.studyCelestialObject();
    }

    /**
     * Override polymorphism
     * Orbit correction of the spaceship
     */
    @Override
    public void orbitCorrection() {
        System.out.println("Se ha ajustado la orbita con exito");
    }

    /**
     * Override polymorphism
     * Delivery supplies to another spaceship
     */
    @Override
    public void supplyShip() {
        super.supplyShip();
    }

    /**
     * Overload polymorphism
     * Send data to Earth (pictures, sensors analysis, etc...)
     */
    public void sendDataToEarth(){
        System.out.println("Datos enviados a la Tierra");
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
