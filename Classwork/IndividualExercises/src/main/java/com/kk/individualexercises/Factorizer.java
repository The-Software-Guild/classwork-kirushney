/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 17/02/22
 *purpose: Exercise Factorizer
 */
package com.kk.individualexercises;

import java.util.Scanner;

public class Factorizer {
    
    public static void main(String [] args) {
        
        int yourNumber;
        int factorCount = 0;
        boolean flag = false;
        int Sum = 0;
        int j;
        
        Scanner newReader = new Scanner(System.in);
        
        System.out.println("What number would you like to factor? ");
        yourNumber = newReader.nextInt();
        
        System.out.print("The factors of " + yourNumber + " are: ");
        
        
        for (int i = 1; i <= yourNumber; ++i) {
        if (yourNumber % i ==0) {
            
            System.out.print(i + " ");
            factorCount++;
        }    
      }
        System.out.println();
        System.out.println(yourNumber + " has " + factorCount + " factors.");
        
        for(int i = 2; i <= yourNumber / 2; ++i) {
            if(yourNumber % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(yourNumber + " is a prime number.");
        else
            System.out.println(yourNumber + " is not a prime number.");
        
        
        for(j = 1; j < yourNumber; j++) {
            if(yourNumber % j == 0) {
                Sum = Sum + j;
            }
        }
        if (Sum == yourNumber) {
            System.out.println(yourNumber + " is a perfect number.");
        }
        else {
            System.out.println(yourNumber + "is not a perfect number.");
                    }

    }  
}
