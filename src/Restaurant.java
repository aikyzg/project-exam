import java.util.Date;

public class Restaurant {
    private String name;
    private boolean isAvailable;

    public Restaurant(String name) {
        this.name = name;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void booking(Customer customer, Date date) {
        if (isAvailable) {
            System.out.println(customer.getName() + " book " + name + " for " + date);
            isAvailable = false;
        } else {
            System.out.println(name + " is already booked for " + date);
        }
    }

}
