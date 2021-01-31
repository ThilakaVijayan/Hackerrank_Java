package com.company.introduction.easy;

import java.util.Scanner;

/**
 * The challenge here is to read n lines of input until you reach EOF, then number
 * and print all n lines of content.
 */
public class Challenge_9_Java_End_of_file {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        while(s.hasNext()){
            System.out.println(i + " " + s.nextLine());
            i++;
        }
    }
}
