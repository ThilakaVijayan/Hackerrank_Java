package com.company.introduction.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Given a double-precision number, payment, denoting an amount of money,
 * use the NumberFormat class' getCurrency Instance method to convert payment
 * into the US, Indian, Chinese, and French currency formats. Then print
 * the formatted values as follows:
 * <p>
 * US: formattedPayment
 * India: formattedPayment
 * China: formattedPayment
 * France: formattedPayment
 * where formattedPayment is payment formatted according to the appropriate
 * Locale's currency.
 * <p>
 * Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
 */
public class Challenge_12_Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
