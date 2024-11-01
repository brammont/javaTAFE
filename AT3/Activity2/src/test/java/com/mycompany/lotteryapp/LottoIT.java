/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lotteryapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 30085203
 */
public class LottoIT {
    
     @Test
    public void testPlayLotto() {
        Lotto lotto = new Lotto();
        int[] winningNumbers = {1, 2, 3, 4, 5, 6};
        String result = lotto.playLotto(winningNumbers);
    
        // Check for expected phrase in result based on exact output of playLotto
        assertTrue(result.contains("Prize is"), "The result should contain the phrase 'Prize is'.");
    }
}
