package com.bridgelabz;

import java.util.Scanner;

public class operators{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number: ");
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = c + a / b;
        double result3 = a % b + c;
        double result4 = a * b + c;

        double maxResult = Math.max(Math.max(Math.max(result1, result2), result3), result4);
        double minResult = Math.min(Math.min(Math.min(result1, result2), result3), result4);

        System.out.println("The maximum result is " + maxResult);
        System.out.println("The minimum result is " + minResult);
    }
}

