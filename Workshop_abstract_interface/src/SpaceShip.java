package src;

/**
 * Class definition
 * basic attributes to define a SpaceShip
 *
 * @author  Daniel Granados
 * @version 1.0.0
 */
abstract class SpaceShip {
    private String name;
    private String country;
    private double weight;
    private double height;
    private String typeFuel;
    private int engines;
    private double thrust;

    /**
     * Constructor for abstract class SpaceShip
     *
     * @param name      Name of the spaceship
     * @param country   what country made the spaceship
     * @param weight    Weight of the spaceship
     * @param height    height of the spaceship
     * @param typeFuel  Type of fuel
     * @param engines   How many engines does it have
     * @param thrust    tons of thrust
     */
    public SpaceShip(String name, String country, double weight, double height, String typeFuel, int engines, double thrust) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.height = height;
        this.typeFuel = typeFuel;
        this.engines = engines;
        this.thrust = thrust;
    }

    /**
     * Show the attributes of the SpaceShip
     */
    void ShowDataSpaceShip(){
        System.out.println("\tSpaceShip Name: " + name + " - " + " Country Origin: " + country);
        System.out.println("\tSpaceShip Weight: " + weight + " - " + " SpaceShip Height: " + height);
        System.out.println("\tSpaceShip N° Engines: " + engines + " - " + " SpaceShip TypeFuel: " + typeFuel);
        System.out.println("\tTons of Thrust: " + thrust);
    }

    /**
     * Getter
     * @return
     * the name of the spaceship
     */
    public String getName() {
        return name;
    }

    /**
     * Setter --
     * Update the name of the spaceship
     * @param name newName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return
     * The country that belongs to the spaceship
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter
     * Update the country
     * @param country newCountry
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter
     * @return
     * The weight of the spaceship
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Setter
     * Update the weight
     * @param weight newWeight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Getter
     * @return
     * The height of the spaceship
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter
     * Update the height
     * @param height newHeight
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Getter
     * @return
     * What kind of fuel use the spaceship
     */
    public String getTypeFuel() {
        return typeFuel;
    }

    /**
     * Setter
     * Update the type of fuel
     * @param typeFuel newTypeFuel
     */
    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    /**
     * Getter
     * @return
     * number of engines
     */
    public int getEngines() {
        return engines;
    }

    /**
     * Setter
     * Update the number of engines
     * @param engines newEngines
     */
    public void setEngines(int engines) {
        this.engines = engines;
    }

    /**
     * Getter
     * @return
     * number of tons of thrust
     */
    public double getThrust() {
        return thrust;
    }

    /**
     * Setter
     * Update the thrust
     * @param thrust newThrust
     */
    public void setThrust(double thrust) {
        this.thrust = thrust;
    }
}
