package com.company;

import java.util.Scanner;

/**
 * Given an integer, n, perform the following conditional actions:
 *
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
 * Complete the stub code provided in your editor to print whether or not n is weird.
 */
public class Challenge_3_Java_If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (n % 2 != 0 || (n > 5 && n <= 20))
            System.out.println("Weird");
        else if (n % 2 == 0 && ((n > 1 && n <= 5) || n > 20))
            System.out.println("Not Weird");

    }
}
