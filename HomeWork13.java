package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int number = scanner.nextInt();
        System.out.println(24 * number + " hours, " + 24 * 60 * number + " minuts, " + 24 * 60 * 60 * number + " seconds");
    }
}
