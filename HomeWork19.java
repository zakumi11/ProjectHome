package com.zakumi.HomeWork;

import java.util.Scanner;
import java.util.Random;

public class HomeWork19 {
    public static void main(String[] args) {
        System.out.println("Enter Hater Name");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int Space = a.indexOf(" ");

        for (int i = 0; i < 10; i ++) {
            Random b = new Random();
            int c1 = b.nextInt(a.length());

            if (c1 == Space){
                c1 = c1 + 1;
            }

            Random r = new Random();
            char c = (char) (r.nextInt(26) + 'a');

        System.out.println(a.substring(0, c1) + c + a.substring(c1 + 1, a.length()));
        }
    }

}
