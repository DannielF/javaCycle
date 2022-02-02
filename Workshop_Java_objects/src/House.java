import java.util.ArrayList;

/**
 * defining the state and methods for a house
 * @version 1.0.0
 * @author Daniel Granados
 */
class House {
    protected ArrayList<String> materials;
    public int floors;
    protected int doors;
    protected int windows;
    private String owner;
    public double houseAntiquity;
    public double price;

    /**
     * Constructor class Fruit
     *
     * @param materials the house was built with
     * @param floors how many floors does it have
     * @param doors how many doors does it have
     * @param windows how many windows does it have
     * @param owner the house owner
     * @param houseAntiquity How old is the house
     * @param price how much does it cost the house
     * */
    public House(ArrayList<String> materials, int floors, int doors, int windows, String owner, double houseAntiquity, double price) {
        this.materials = materials;
        this.floors = floors;
        this.doors = doors;
        this.windows = windows;
        this.owner = owner;
        this.houseAntiquity = houseAntiquity;
        this.price = price;
    }

    /**
     * Getter
     * Retrieve the materials
     * */
    public ArrayList<String> getMaterials() {
        return materials;
    }

    /**
     * Setter
     * Add a new material
     * */
    public void setMaterials(ArrayList<String> materials) {
        this.materials = materials;
    }

    /**
     * Getter
     * @return
     * Retrieve how many doors are there
     */
    public int getDoors() {
        return doors;
    }

    /**
     * Setter
     * @param doors
     * Add a new door
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * Getter
     * @return
     * How many windows are there
     */
    public int getWindows() {
        return windows;
    }

    /**
     * Setter
     * @param windows
     * Add a new window
     */
    public void setWindows(int windows) {
        this.windows = windows;
    }

    /**
     * Getter
     * @return
     * Who is the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter
     * @param owner
     * A new owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * The house is on sale
     */
    public void onSale(){
        System.out.println("The house is on sale!");
    }

    /**
     * Upgrade the house and improve its services
     */
    protected void upgradeHouse(){
        System.out.println("Services improved");
    }

    /**
     * Calculate the annual taxes for the house
     * @param taxRate  property tax rate
     * @return
     * How much should you pay per year
     */
    private double annualTaxes(int taxRate){
        return (price * taxRate)/100;
    }
}
