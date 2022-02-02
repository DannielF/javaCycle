import java.time.LocalDate;

/**
 * defining the state and behaviors of a person
 *type LocalDate - date without time
 *@see "https://www.joda.org/joda-time/"
 *
 * @version 1.0.0
 * @author Daniel Granados
 */

class Person {
    public String name;
    public String firstLastName;
    public String secondLastName;
    public LocalDate dateOfBirth;
    public float height;
    public String gender;

    /**
     * constructor class people
     *
     * @param dateOfBirth year-month-day
     * @param gender gender person (M, F)
     * */
    public Person(String name, String firstLastName, String secondLastName, LocalDate dateOfBirth, float height, String gender){
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.gender = gender;
    }

    /**
     * getter
     * @see #getName() - return people name
     * */
    public String getName() {
        return name;
    }

    /**
     * setter
     * @see #setName(String) - set a new name
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter
     * @see #getGender() - return gender person
     * */
    public String getGender() {
        return gender;
    }

    /**
     * setter
     * @see #setGender(String)  - set a new gender
     * */
    public void setGender(String gender) {
        this.gender = gender;
    }
}