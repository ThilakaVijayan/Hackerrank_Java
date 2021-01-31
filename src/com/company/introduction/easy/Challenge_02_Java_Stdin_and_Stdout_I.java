package com.company.introduction.easy;

import java.util.Scanner;

/**
 * In this challenge, you must read 3 integers from stdin and then
 * print them to stdout. Each integer must be printed on a new line.
 * To make the problem a little easier, a portion of the code is
 * provided for you in the editor below.
 */
public class Challenge_02_Java_Stdin_and_Stdout_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }
}
