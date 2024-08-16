
package javastory;
import java.util.Scanner;
/**
 *
 * @author 30085203
 */

public class JavaStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for various inputs
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter an age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter a city: ");
        String city = scanner.nextLine();

        System.out.print("Enter a verb (e.g., runs, reads, sings): ");
        String verb = scanner.nextLine();

        System.out.print("Enter a number (e.g., 3.14): ");
        double number = scanner.nextDouble();

        // Output the story with user inputs
        System.out.println("\nOnce upon a time, there was a person named " + name + " who was " + age + " years old.");
        System.out.println(name + " lived in the city of " + city + " and loved to " + verb + ".");
        System.out.println("One day, " + name + " found a magical number " + number + " and went on an adventure.");
    }
}
