import java.sql.Timestamp;
import java.util.Date;

public class Employee {

    // Attributes: id, name, company, timestamp, and dateTime
    private final int id;
    private final String name;
    private final String company;
    private final Timestamp timestamp;
    private final Date dateTime;

    // Constructor to initialize an Employee object with an id, name, and company
    public Employee(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;

        // Set timestamp with the current time
        this.timestamp = new Timestamp(new Date().getTime());

        // Set dateTime with the current date and time
        this.dateTime = new Date();
    }

    // Overriding toString method to display Employee details
    public String toString() {
        // Format and return Employee details as a string
        String output = "Employee: ( " + id + ", " + name + ", " + company + ", " + timestamp + ", " + dateTime + " )";
        return output;
    }
}

