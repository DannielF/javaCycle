
/**
 * defining the state and methods for a planet
 * @version 1.0.0
 * @author Daniel Granados
 */
class Planet {
    protected double population;
    public double planetAge;
    private final double sizePlanet;
    private double satellite;
    public boolean hasAtmosphere;

    /**
     * Constructor class Fruit
     *
     * @param population people inside the planet
     * @param planetAge age of the planet
     * @param sizePlanet size of the planet
     * @param satellite number of satellites (moon is a satellite)
     * @param hasAtmosphere the planet has a atmosphere (who knows)
     * */
    public Planet(double population, double planetAge, double sizePlanet, double satellite, boolean hasAtmosphere) {
        this.population = population;
        this.planetAge = planetAge;
        this.sizePlanet = sizePlanet;
        this.satellite = satellite;
        this.hasAtmosphere = hasAtmosphere;
    }


    /**
     * Getter
     * @see #getPopulation() how many people are inside the planet
     * */
    public double getPopulation(){
        return population;
    }

    /**
     * Setter
     * @see #setPopulation(double) more people inside this poor planet
     * */
    public double setPopulation(double population){
        return this.population = population;
    }

    /**
     * Getter
     * @see #getPlanetAge() how old is the planet
     * */
    public double getPlanetAge() {
        return planetAge;
    }

    /**
     * Setter
     * @see #setPlanetAge(double) modify planet age
     * */
    public void setPlanetAge(double planetAge) {
        this.planetAge = planetAge;
    }

    /**
     * Getter
     * @see #getSatellite() how many satellites belongs to the planet
     * */
    public double getSatellite() {
        return satellite;
    }

    /**
     * Setter
     * @see #setSatellite(double) add satellites to the planet
     * */
    public void setSatellite(double satellite) {
        this.satellite = satellite;
    }

    /**
     * Launch a rocket inside the planet into space
     * @param rocket number of rockets
     *
     * */
    private void launchRocketIntoSpace(int rocket){
        if(rocket == 1)
            System.out.format("Rocket launched: %d%n", rocket);
        else
            System.out.format("Rockets launched: %d%n", rocket);
    }

    /**
     * A new alien invade our planet for sightseeing, how awful
     * */
    protected void newAlien(){
        System.out.println("There's a new alien doing sightseeing on the planet ");
    }
}
