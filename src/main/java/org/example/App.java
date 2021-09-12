package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variable
        double orderA, tax = 0, total;
        String state, county;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("What is the order amount?");
        orderA = sc.nextFloat();
        System.out.println("What state do you live in?");
        state = sc.next();

        //use user input to calculate tax
        if(state.equals("Wisconsin")){
            tax = 0.05;
            System.out.println("What county do you live in?");
            county = sc.next();
            if(county.equals("Eau Claire")){
                tax = 0.055;
            }
            else if(county.equals("Dunn")){
                tax = 0.054;
            }
        }
        else if(state.equals("Illinois")){
            tax = 0.08;
        }

        //calculations
        total = (tax*orderA) + orderA;

        //output
        System.out.println("The tax is $" + (tax*orderA) + ".");
        System.out.println("The total is $" + total + ".");

        //close scanner
        sc.close();
    }
}
