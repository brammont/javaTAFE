/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package totalaverageapp;

/**
 *
 * @author 30085203
 */
public class TotalAverageApp {

    public static void main(String[] args) {
        // Create an instance of TotalAverageCalculator
        TotalAverageCalculator tac = new TotalAverageCalculator();

        // Array of integers to calculate total and average
        int[] numbers = {10, 5, 6, 7, 89};

        // Get total and average
        int total = tac.getTotal(numbers);
        double average = tac.getAverage(numbers);

        // Output the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
