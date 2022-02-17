/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 16/02/22
 *purpose: Programming For Loops Exercise 1
 */
package com.sg.foundations.flowcontrol.fors;

public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i = 0; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}