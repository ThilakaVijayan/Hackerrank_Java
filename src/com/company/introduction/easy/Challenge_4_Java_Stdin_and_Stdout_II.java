package com.company.introduction.easy;

import java.util.Scanner;

/**
 * In this challenge, you must read an integer, a double, and a String from stdin, then print the values
 */
public class Challenge_4_Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
