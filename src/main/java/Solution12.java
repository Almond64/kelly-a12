/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int principal = input.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        //calculate the investment total
        double total = principal * (1 + (rate / 100)*years);
        /*
        Separate the change from the total, then Math.ceil(change*100).
        Divide this value by 100 and then add it back in the total.
         */
        System.out.printf("Total %f\n", total);
        //System.out.printf("After %d years at %.2f, the investment will be worth $%.2f\n", years, rate, total);
    }
}
