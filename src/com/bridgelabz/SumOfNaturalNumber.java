package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}

