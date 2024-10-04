/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package totalaverageapp;

/**
 *
 * @author 30085203
 */
class TotalAverageCalculator {
    // Method to calculate total
    public int getTotal(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // Method to calculate average
    public double getAverage(int[] numbers) {
        int total = getTotal(numbers);
        return (double) total / numbers.length;
    }
}
