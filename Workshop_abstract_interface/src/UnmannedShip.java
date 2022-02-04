package src;

/**
 *  class definition of Unmanned spaceship
 *  inheritance from SpaceShip
 *  implements from IunmannedShip
 *
 *  @author  Daniel Granados
 *  @version 1.0.0
 */
abstract class UnmannedShip extends  SpaceShip implements IunmannedShip{
    protected String typeShip;
    protected boolean photoVCells;
    protected double travelSpeed;

    /**
     * Constructor for abstract class UnmannedShip
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
    public UnmannedShip(String name, String country, double weight, double height, String typeFuel, int engines, double thrust, String typeShip, boolean photoVCells, double travelSpeed) {
        super(name, country, weight, height, typeFuel, engines, thrust);
        this.typeShip = typeShip;
        this.photoVCells = photoVCells;
        this.travelSpeed = travelSpeed;
    }

    /**
     * Override polymorphism
     * Take a picture of the space
     */
    @Override
    public void takePictureSpace() {
        System.out.println("Imagen del espacio tomada");
    }

    /**
     * Override polymorphism
     * Study a celestial object like Moon or another stars
     */
    @Override
    public void studyCelestialObject() {
        System.out.println("Estudiando objeto celeste");
    }

    /**
     * Override polymorphism
     * Orbit correction
     */
    @Override
    public void orbitCorrection() {
        System.out.println("Corrigiendo órbita");
    }

    /**
     * Override polymorphism
     * Delivery supplies to another spaceship
     */
    @Override
    public void supplyShip() {
        System.out.println("Entregando recursos");
    }
}
