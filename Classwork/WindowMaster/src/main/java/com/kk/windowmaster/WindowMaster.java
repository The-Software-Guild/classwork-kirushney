/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 16/02/22
 *purpose: calculate the total cost for home replacement windows
 */
package com.kk.windowmaster;

import java.util.Scanner;    
                
public class WindowMaster {
    public static void main(String [] args) {
        // declare variables for height and weight
        float height;
        float width;
        
        // declare variable for number of windows
        float numberOfWindows;
        
        // declare String variables to hold the user's height
        // and width input
        String stringHeight;
        String stringWidth;
        
        //declare String variables to hold the user's number of windows
        String stringNumberOfWindows;
       
        // declare other variables
        float areaOfWindow;
        float totalCost;
        float perimeterOfWindow;
        float costOfTrim;
        float costOfWindow;
        
         //declare String variables to hold the user's cost of window and trim
        String stringCostOfTrim;
        String stringCostOfWindow;
        
        //declare and initialise the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        // get input for cost of window and trim from user
        System.out.println("Please enter cost of window:");
        stringCostOfWindow = myScanner.nextLine();
        System.out.println("Please enter cost of trim:");
        stringCostOfTrim = myScanner.nextLine();
        
        // get input for number of windows from user
        System.out.println("Please enter the number of windows:");
        stringNumberOfWindows = myScanner.nextLine();
        
        // convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // convert String values of cost of trim and window to float values
        costOfTrim = Float.parseFloat(stringCostOfTrim);
        costOfWindow = Float.parseFloat(stringCostOfWindow);
        
        // convert String values of number of windows to float values
        numberOfWindows = Float.parseFloat(stringNumberOfWindows);
        
        // calcuate the area of the window
        areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the total cost - use a hard-coded value
        // for material cost
        //cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        //calcualte the total cost using user input
        //totalCost = costOfTrim + costOfWindow;
        totalCost = numberOfWindows * (costOfTrim + costOfWindow);
        
        //display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Number of Windows = " + numberOfWindows);
        System.out.println("Total Cost = " + totalCost);
    }
    
}
