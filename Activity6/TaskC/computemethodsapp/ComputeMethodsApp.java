

package computemethodsapp;
import java.util.Scanner;

public class ComputeMethodsApp {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Read temperature in Fahrenheit from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Read triangle sides (width and height) from the user
        System.out.print("Enter width of the triangle: ");
        int width = scanner.nextInt();
        
        System.out.print("Enter height of the triangle: ");
        int height = scanner.nextInt();

        // Create an instance of ComputeMethods
        ComputeMethods compute = new ComputeMethods();

        // Convert Fahrenheit to Celsius and display the result
        double celsius = compute.fToC(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);

        // Calculate the hypotenuse and display the result
        double hypotenuseLength = compute.hypotenuse(width, height);
        System.out.println("Hypotenuse of the triangle: " + hypotenuseLength);

        // Simulate rolling two dice and display the result
        int diceRoll = compute.roll();
        System.out.println("Sum of dice rolls: " + diceRoll);

        // Close the scanner
        scanner.close();
    }
}
