package com.company.introduction.easy;

import java.util.Scanner;

/**
 * We use the integers a, b, and n to create the following series:
 *  (a + 2^0 * b), (a + 2^0 * b + 2^0 *b), ...., (a + 2^0 * b + 2^0 * b + ....+ 2^n-1 *b)
 *
 * You are given q queries in the form of a, b, and n. For each query, print
 * the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
 */
public class Challenge_7_Java_Loops_II {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum = sum + (int) (((Math.pow(2, j)) * b));
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
