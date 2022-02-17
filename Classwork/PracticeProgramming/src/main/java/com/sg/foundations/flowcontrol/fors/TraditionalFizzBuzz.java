/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 16/02/22
 *purpose: Programming For Loops Exercise 9
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life?");
        
     int fizz = userInput.nextInt();
     
     for (int i = 0; i <=10; i++){
         if (i % 3 ==0){
             System.out.println("fizz");
         } else if (i % 5 ==0){
             System.out.println("buzz"); 
     }
         System.out.println("fizz buzz");
         
   }
}
