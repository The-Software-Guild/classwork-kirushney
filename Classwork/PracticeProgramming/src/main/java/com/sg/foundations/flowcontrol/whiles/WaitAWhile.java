/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 16/02/22
 *purpose: Programming Whiles & Dos Exercise 1
 */
package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {
    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;
        
        //when bedTime value is equal to 11,
        //The "It's only" statements print up until 11 o'clock
        
        //when timeNow value is equal to 11,
        //"Guess I should go to bed" prints - goes to the end of the code

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        //if timeNow++ is commented out, the code runs endlessly
        
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
