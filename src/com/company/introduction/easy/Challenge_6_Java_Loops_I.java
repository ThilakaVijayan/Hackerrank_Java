package com.company.introduction.easy;

import java.util.Scanner;

/**
 * Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10)
 * should be printed on a new line in the form: N x i = result.
 */
public class Challenge_6_Java_Loops_I {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
