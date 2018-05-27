package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance(km) and time(h)");
        double distanse = scanner.nextInt();
        double time = scanner.nextInt();
        double speed = distanse / time;
        System.out.println(speed + " km/h");

    }

}
