import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Restaurant restaurant1 = new Restaurant("Restaurant A");
        Restaurant restaurant2 = new Restaurant("Restaurant B");

        Customer customer1 = new Customer("Customer X");
        Customer customer2 = new Customer("Customer Y");

        restaurant1.booking(customer1, new Date());
        restaurant2.booking(customer2, new Date());

        restaurant1.booking(customer2, new Date());
    }
}