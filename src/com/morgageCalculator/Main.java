package com.morgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Principal: ");
//        long principal = scanner.nextLong();
//        System.out.print("Annual Interest Rate: ");
//        float rate = scanner.nextFloat();
//        System.out.print("Period (Years): ");
//        long period = scanner.nextInt();
//
//        float monthlyRate = rate / (100 * 12);
//        long payments = period * 12;
//
//        double mortgage = principal * ((monthlyRate * Math.pow(1 + monthlyRate, payments) /
//                (Math.pow(1 + monthlyRate, payments) - 1)));
//        System.out.println(mortgage);
final byte MONTHS_IN_YEAR = 12;
final byte PERCENT = 100;

Scanner scanner = new Scanner(System.in);
System.out.print("Principal: ");
int principal = scanner.nextInt();

System.out.print("Annual Interest Rate: ");
float annualInterest = scanner.nextFloat();
float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

System.out.print("Period (Years): ");
byte years = scanner.nextByte();
int numberOfPayments  = years * MONTHS_IN_YEAR;

double mortgage = principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
System.out.println("Mortgage: " + mortgageFormatted);
    }
}
