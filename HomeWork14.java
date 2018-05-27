package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number UAH and kurs USD");
        double UAH = scanner.nextDouble();
        double kurs = scanner.nextDouble();
        System.out.println(UAH / kurs + " USD");
    }
}
