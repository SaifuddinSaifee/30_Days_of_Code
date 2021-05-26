package com.company;

import java.util.Scanner;

public class HRChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        int T = sc.nextInt(); // tip percentage
        int X = sc.nextInt(); // tax percentage

        // Enter your code here!
        double temp = M + (M*T/100) + (M*X/100);
        // Run some computations....

        int total = (int) Math.round(temp);

        // ...then print!
        System.out.println("The final price of the meal is $"+total+".");

    }
}
