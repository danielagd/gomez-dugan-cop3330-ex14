package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class TaxCalculator
{
    public static void main( String[] args )
    {
        // Program to calculate order including state tax, if applied
        Scanner int_input = new Scanner(System.in);
        Scanner str_input = new Scanner(System.in);
        final double tax = 0.055;

        System.out.print("What is the order amount? ");
        double subtotal = int_input.nextDouble();
        System.out.print("What is the state? ");
        String state = str_input.nextLine().toUpperCase();

        // Checks and prints if state inputted is Wisconsin
        if (state.equals("WI"))
        {
            double total = (subtotal * tax) + subtotal;
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", subtotal, subtotal * tax, total);
            return;
        }

        // Prints if state is not Wisconsin
        System.out.printf("The total is $%.2f.", subtotal);
    }
}

