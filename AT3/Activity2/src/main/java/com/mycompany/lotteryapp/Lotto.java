/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lotteryapp;

/**
 *
 * @author 30085203
 */
import java.util.Random;

public class Lotto {
    private String companyName;
    private int[] numbers = new int[6];

    public Lotto() {
        this.companyName = "ABC Lottery Co.";
        generateNumbers();
    }

    public Lotto(String name) {
        this.companyName = name;
        generateNumbers();
    }

    private void generateNumbers() {
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(7) + 1; // Generate numbers between 1 and 7
        }
    }

    public String playLotto(int[] winningNumbers) {
    int matches = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == winningNumbers[i]) {
            matches++;
        }
    }
    double prize = Math.pow(2, matches) * 100;

    // Format output to include the word "matches" as expected by the test
    StringBuilder result = new StringBuilder();
    result.append("### ").append(companyName).append(" ###\n");
    result.append("Winning numbers: ");
    for (int num : winningNumbers) {
        result.append(num).append(" ");
    }
    result.append("\nLotto numbers:   ");
    for (int num : numbers) {
        result.append(num).append(" ");
    }
    result.append("\nPrize is $" + prize + " with " + matches + " matches\n");

    return result.toString();
}

    public int[] getNumbers() {
        return numbers;
    }

    public String getCompanyName() {
        return companyName;
    }
}

