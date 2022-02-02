package WorkShop_Java_objects;
import java.time.LocalDate;

/**
 * Create attributes and methods for class People
 *type LocalDate - date without time
 *@see "https://www.joda.org/joda-time/"
 *
 * @version 1.0.0
 * @author Daniel Granados
 */

class People {
    String name;
    String firstLastName;
    String secondLastName;
    LocalDate dateOfBirth;
    float height;
    String gender;

    /**
     * constructor class people
     *
     * @param dateOfBirth year-month-day
    * */
    public People(String name, String firstLastName, String secondLastName, LocalDate dateOfBirth, float height, String gender){
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.gender = gender;
    }

    /**
     * getter and setter
     *
     * setName() - update people name
     * setGender() - Update people gender
    * */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
