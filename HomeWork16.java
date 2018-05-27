package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter t C");
        double c = scanner.nextInt();
        double f = c * (9.0 / 5) + 32;
        System.out.println(f);
    }
}
