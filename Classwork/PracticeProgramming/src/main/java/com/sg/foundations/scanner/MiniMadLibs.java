/**
 *@author Kirushney Kalamohan
 *email: kirushney@hotmail.co.uk
 *date: 16/02/22
 *purpose: Programming Scanner Exercise 8
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        //declaring variables
        String noun1;
        String adjective1;
        String noun2;
        int number;
        String adjective2;
        String pluralNoun1;
        String pluralNoun2;
        String pluralNoun3;
        String verbPresentTense;
        String sameVerbPastTense;
        
        //assigning values to strings
        System.out.println("I need a noun: ");
        noun1 = inputReader.nextLine();
        System.out.println("Now an adjective: ");
        adjective1 = inputReader.nextLine();
        System.out.println("Another noun: ");
        noun2 = inputReader.nextLine();
        System.out.println("And a number: ");
        number = Integer.parseInt(inputReader.nextLine());
        System.out.println("Another adjective: ");
        adjective2 = inputReader.nextLine();
        System.out.println("A plural noun: ");
        pluralNoun1 = inputReader.nextLine();
        System.out.println("Another one: ");
        pluralNoun2 = inputReader.nextLine();
        System.out.println("One more: ");
        pluralNoun3= inputReader.nextLine();
        System.out.println("A verb (infinitive form): ");
        verbPresentTense = inputReader.nextLine();
        System.out.println("Same verb (past participle): ");
        sameVerbPastTense = inputReader.nextLine();
        System.out.println();
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.print(noun1 + ": the " + adjective1 + " frontier. ");
        System.out.print("These are the voyages of the starship " + noun2 + ". ");
        System.out.print("Its " + number + "-year mission: to explore strange ");
        System.out.print(adjective2 + " " + pluralNoun1 + ", to seek out ");
        System.out.print(adjective2 + " " + pluralNoun2 + " and ");
        System.out.print(adjective2 + " " + pluralNoun3 + ", to boldly ");
        System.out.print(verbPresentTense + " where no one has ");
        System.out.print(sameVerbPastTense + " before.");
    }
}