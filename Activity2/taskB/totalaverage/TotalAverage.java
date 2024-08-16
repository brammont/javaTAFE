
package totalaverage;
import java.util.Scanner;
/**
 *
 * @author 30085203
 */

public class TotalAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        // Calculate the total and average
        int total = number1 + number2 + number3;
        double average = (double) total / 3; // Ensure the division results in a decimal number
        // Output the total and average
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
