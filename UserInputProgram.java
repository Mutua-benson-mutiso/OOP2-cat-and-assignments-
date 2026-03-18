//REG NUMBER: CT100/G/22490/24
//NAME: MUTUA BENSON MUTISO
import java.util.Scanner;

public class UserInputProgram {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        float height;
        double bankBalance;
        String phoneNumber;
        System.out.print("Enter your height (in meters or centimeters): ");
        height = input.nextFloat();
        System.out.print("Enter your bank balance (in Kenya Shillings): ");
        bankBalance = input.nextDouble();
        System.out.print("Enter your phone number: ");
        phoneNumber = input.next();

        // Display the entered details
        System.out.println("\n----- User Details -----");
        System.out.println("Height: " + height);
        System.out.println("Bank Balance: KSh " + bankBalance);
        System.out.println("Phone Number: " + phoneNumber);
        input.close();
    }
}