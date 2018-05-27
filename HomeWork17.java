package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter You FIO");
        String surname = scanner.next();
        String name = scanner.next();
        String patronymic = scanner.next();
        System.out.println(name + " " + patronymic + " " + surname);
    }
}
