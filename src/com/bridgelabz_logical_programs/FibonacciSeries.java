package com.bridgelabz_logical_programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input to print series till nth term =");
        int input = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1 ;
        int nextTerm;

        System.out.println("Fibonacci Series till"+input+"term is = ");
        for(int i =1 ; i <= input ; i++) {
            System.out.print(firstTerm+" ,");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
