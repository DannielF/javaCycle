import java.time.LocalDate;
import java.util.ArrayList;

/**
 * defining the state and methods for a bank account
 * @version 1.0.0
 * @author Daniel Granados
 */
class bankAccount {
    private int accountNumber;
    protected boolean activated;
    private LocalDate creationDate;
    private double amount;

    /**
     * Constructor class Fruit
     *
     * @param accountNumber Account number assigned
     * @param activated the account isActivated?true:false
     * @param amount money available
     * @param creationDate the day the account was created
     * */
    public bankAccount(int accountNumber, boolean activated, LocalDate creationDate, double amount) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.creationDate = creationDate;
        this.amount = amount;
    }

    /**
     * Getter
     * @see #getAccountNumber() - Account number
     * */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter
     * @see #getActivated() - True or False
     * */
    public boolean getActivated(){
        return activated;
    }

    /**
     * Getter
     * @see #getAmount() - Money available
     * */
    public double getAmount() {
        return amount;
    }

    /**
     * Setter
     * @see #setActivated(boolean) - set a new state between True or False
     * */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
