import java.util.ArrayList;

/**
 * defining the state and methods for a fruit
 * @version 1.0.0
 * @author Daniel Granados
 */

class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> color;
    public double price;
    public String shape;

    /**
     * Constructor class Fruit
     *
     * @param averageWeight average weight of that kind of fruit
     * @param color how many colors does the fruit have
     * @param shape its shape (square, round, etc...)
     * */
    public Fruit(String name, float averageWeight, ArrayList<String> color, double price, String shape) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color = color;
        this.price = price;
        this.shape = shape;
    }

    /**
     * Getter
     * @see #getColor() - return color of the fruit
     * */

    public ArrayList<String> getColor() {
        return color;
    }

    /**
     * Setter
     * @see #setColor(ArrayList)  - Set a new value(color) for Fruit class
    * */
    public void setColor(ArrayList<String> color) {
        this.color = color;
    }

    /**
     * Getter
     * @see #getAverageWeight() - return average weight of the fruit
     * */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Setter
     * @see #setAverageWeight(float) - Set a new average weight 
     * */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Getter
     * @see #getPrice() - return price of the fruit
     * */
    public double getPrice() {
        return price;
    }

    /**
     * Setter
     * @see #setPrice(double) - Set a new price of the fruit
     * */
    public void setPrice(double price) {
        this.price = price;
    }
}
