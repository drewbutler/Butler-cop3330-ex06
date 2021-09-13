/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your current age?");
        int currentAge = myObj.nextInt();

        System.out.println("At what age would you like to retire?");
        int retireAge = myObj.nextInt();

        int diff = retireAge - currentAge;

        System.out.println("You have " + diff + " years left unitl you can retire.");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = year + diff;

        System.out.println("It's " + year + ", so you can retire in " + retireYear);

        myObj.close();
    }
}