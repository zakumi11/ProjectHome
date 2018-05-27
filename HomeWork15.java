package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter katety");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double S = (a * b) / 2;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double P = a + b + c;
        System.out.println("S = " + S + ", P = " + P + ", hypotenuse = " + c);
    }
}
