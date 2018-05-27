package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < 11; i++)
        {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        }
    }
