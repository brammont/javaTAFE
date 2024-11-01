/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lotteryapp;

/**
 *
 * @author 30085203
 */
public class LotteryApp {

    public static void main(String[] args) {
        Lotto lotto1 = new Lotto();
        Lotto lotto2 = new Lotto("WA Lottery");
        int[] winningNumbers = {3, 5, 4, 3, 7, 1};

        System.out.println(lotto1.playLotto(winningNumbers));
        System.out.println(lotto2.playLotto(winningNumbers));
    }
}