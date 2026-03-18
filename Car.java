// NAME : MUTUA BENSON MUTISO
// REGISTRATION NUMBER: CT100/G/22490/24
public class Car extends Vehicle {
    // Additional field for Car
    private String fuelType;

    // Constructor initializing both Vehicle and Car fields
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Initialize parent class fields
        this.fuelType = fuelType;
    }

    // Override displayDetails to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Display Vehicle details
        System.out.println("Fuel Type: " + fuelType);
    }
}