package com.bridgelabz_logical_programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input to check Prime Number = ");
        int input = sc.nextInt();
        int count = 0;

        for(int i=2; i<input ; i++){
            if (input % i == 0) {
                count++;
            }
        }
        if(count == 0) {
            System.out.println(input+" is a Prime Number");
        }else {
            System.out.println(input+" is not a Prime Number");
        }
    }
}
