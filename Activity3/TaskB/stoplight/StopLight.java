/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package stoplight;

/**
 *
 * @author 30085203
 */
import java.util.Scanner;

public class StopLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value for the current color
        System.out.print("Enter a colour code (1: red, 2: green, 3: yellow): ");
        int currentColor = scanner.nextInt();

        // Determine the next color based on the current color using a switch statement
        switch (currentColor) {
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid colour");
                break;
        }

        scanner.close();
    }
}
