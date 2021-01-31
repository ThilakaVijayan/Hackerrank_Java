package com.company.introduction.easy;

import java.util.Scanner;

/**
 * It's time to test your knowledge of Static initialization blocks.
 * You can read about it here.
 * <p>
 * You are given a class Solution with a main method. Complete the given
 * code so that it outputs the area of a parallelogram with breadth B and
 * height H. You should read the variables from the standard input.
 * <p>
 * If B <= 0 or H <= 0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 */
public class Challenge_10_Java_Static_Initializer_Block {
    //Write your code here

    private static Scanner sc = new Scanner(System.in);
    private static int B = sc.nextInt();
    private static int H = sc.nextInt();
    private static boolean flag = false;

    static {
        if (B <= 0 || H <= 0) {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
            }
        }else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
