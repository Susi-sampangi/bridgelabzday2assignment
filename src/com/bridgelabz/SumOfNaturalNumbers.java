package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            System.out.println("The sum of first " + n + " natural numbers is " + sum + ".");
        }


    }
}


