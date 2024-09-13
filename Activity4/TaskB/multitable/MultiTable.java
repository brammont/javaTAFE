/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package multitable;
import java.util.Scanner;
/**
 *
 * @author 30085203
 */
public class MultiTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Choose a number: ");
        int number = scanner.nextInt();

        // Display the multiplication table for the given number
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
