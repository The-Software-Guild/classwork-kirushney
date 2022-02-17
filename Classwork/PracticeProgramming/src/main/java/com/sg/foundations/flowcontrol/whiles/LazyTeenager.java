/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 16/02/22
 *purpose: Programming Whiles & Dos Exercise 9
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class LazyTeenager {
    
    public static void main(String[] args) { 
       
        int i = 0;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Have you cleaned your room? (y/n) ");
        
        String action = userInput.nextLine();
         
        if (action.equals("y")) {
            System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
        } else if (action.equals("n")) {
            System.out.println("Clean your room!!");
        } else {
            System.out.println("THAT'S IT!");
        }
            
      }
    }