import java.util.ArrayList;

/**
 * defining the state and methods for a videoGame
 * @version 1.0.0
 * @author Daniel Granados
 */
class VideoGame {
    public String name;
    protected String rateESRB;
    private ArrayList<String> creators;
    public double releaseYear;
    protected double price;

    /**
     * Constructor class Fruit
     *
     * @param name name of the videoGame
     * @param rateESRB age and content rating
     * @param creators who created the game
     * @param releaseYear the game was release that year
     * @param price how much does it cost
     * */
    public VideoGame(String name, String rateESRB, ArrayList<String> creators, double releaseYear, double price) {
        this.name = name;
        this.rateESRB = rateESRB;
        this.creators = creators;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    /**
     * getter
     * Retrieve ESRB rating
     * */
    public String getRateESRB() {
        return rateESRB;
    }

    /**
     * setter
     * Set a new ESRB rating
     * */
    public void setRateESRB(String rateESRB) {
        this.rateESRB = rateESRB;
    }

    /**
     * getter
     * Retrieve who created the game
     * */
    public ArrayList<String> getCreators() {
        return creators;
    }

    /**
     * getter
     * Get the price
     * */
    public double getPrice() {
        return price;
    }

    /**
     * setter
     * Set a new price
     * */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Method
     * Run the game, get fun
     * */
    private void runGame(){
        System.out.println("The game has started");
    }

    /**
     * Method
     * Save the game
     * */
    protected void SaveGame(){
        System.out.println("The game has been saved");
    }

    /**
     * Method
     * Sell the game
     * Return the profit
     * */
    private double sellGame(double salePrice){
        return salePrice - price;
    }
}
