package com.bridgelabz_logical_programs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check perfect Number or not");
        int num = sc.nextInt();
        System.out.println("Positive Divisors = ");
        int output=0;
        for(int i=1 ; i<num; i++) {
            if(num % i == 0){
                System.out.print(i+" ,");
                output += i ;
            }
        }
        System.out.println();
        if(output == num) {
            System.out.println(num+" is a Perfect Number");
        }else {
            System.out.println(num+" is not a Perfect Number");
        }
    }
}

