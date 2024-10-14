/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package numberwithspaces;
import java.io.*;
/**
 *
 * @author 30085203
 */
public class NumberWithSpaces {
    public static void main(String[] args) {
        // Get the current working directory
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDirectory);

        // Adjust the filename to look inside the "numberwithspaces" folder
        String filename = currentDirectory + File.separator + "numberwithspaces" + File.separator + "number.txt";

        // Check if the file exists
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }

        try {
            // Reading the number from the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String numberStr = reader.readLine();
            reader.close();

            // Writing separated digits to separated.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(currentDirectory + File.separator + "numberwithspaces" + File.separator + "separated.txt"));
            System.out.print("Separated digits: ");
            
            // Loop through each character in the string (each digit)
            for (int i = 0; i < numberStr.length(); i++) {
                char digit = numberStr.charAt(i);
                
                // Write the digit to the file and print it to the console
                writer.write(digit + " ");
                System.out.print(digit + " ");
            }
            
            writer.close();
            System.out.println("\nDigits have been written to separated.txt");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file.");
        }
    }
}