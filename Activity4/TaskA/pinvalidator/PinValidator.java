/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pinvalidator;

import java.util.Scanner;

public class PinValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare the valid PIN
        int validPin = 1234;

        // Initialize a variable to store the entered PIN
        int enteredPin;

        // Prompt the user to enter the PIN
        System.out.print("Please enter your PIN: ");
        enteredPin = scanner.nextInt();

        // Use a while loop to validate the entered PIN
        while (enteredPin != validPin) {
            System.out.println("Incorrect PIN. Please try again.");
            System.out.print("Please enter your PIN: ");
            enteredPin = scanner.nextInt();
        }

        // Print confirmation message
        System.out.println("Correct PIN entered. You now have access to your account.");

        scanner.close();
    }
}
