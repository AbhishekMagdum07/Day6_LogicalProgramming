package com.bridgelabz_logical_programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input =");
        int input = sc.nextInt();
        int digit;
        int reverse = 0;

        while (input != 0) {
            digit = input % 10 ;
            reverse = reverse * 10 + digit;

            input /= 10;
        }
        System.out.println("Reverse Number = "+reverse);
    }
}
