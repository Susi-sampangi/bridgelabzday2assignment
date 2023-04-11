package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int reversedNum = 0;

        // reverse the number
        for (int i = num; i != 0; i /= 10) {
            reversedNum = reversedNum * 10 + i % 10;
        }

        // check if the number is a palindrome or not
        if (num == reversedNum) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}

