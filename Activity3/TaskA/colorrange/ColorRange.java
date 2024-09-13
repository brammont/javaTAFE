
package colorrange;

/**
 *
 * @author 30085203
 */
import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the wavelength
        System.out.print("Enter a wavelength in nanometres: ");
        double wavelength = scanner.nextDouble();

        // Determine the color based on the wavelength
        if (wavelength >= 380 && wavelength < 450) {
            System.out.println("The colour is Violet");
        } else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("The colour is Blue");
        } else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("The colour is Green");
        } else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("The colour is Yellow");
        } else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("The colour is Orange");
        } else if (wavelength >= 620 && wavelength < 750) {
            System.out.println("The colour is Red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }

        scanner.close();
    }
}
