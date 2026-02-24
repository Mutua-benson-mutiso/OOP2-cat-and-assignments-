public class Vehicle {

    protected String brand;
    protected String model;
    protected int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class Car extends Vehicle {
    private String fuelType;
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);  // Call parent constructor
        this.fuelType = fuelType;
    }
    public void displayDetails() {
        super.displayDetails();  // Call parent method
        System.out.println("Fuel Type: " + fuelType);
    }
}
import java.util.Scanner;

public class Showroom {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();
        Car car = new Car(brand, model, year, fuelType);

        System.out.println("\nCar Details:");
        car.displayDetails();
        
        scanner.close();
    }
}

