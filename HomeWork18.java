package com.zakumi.HomeWork;

import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args) {
            System.out.println("Enter FIO");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();

            for(int i = a.length()-1; i >= 0; i--){
                    System.out.print(a.charAt(i));
            }
        }
    }



package com.zakumi.project;

import java.util.Scanner;
import java.util.Random;

public class Project {
    public static void main(String[] args) {
        System.out.println("Enter Hater Name");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        Random b = new Random();
        char c1 = (char)(a.length());
        
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        System.out.println(c);


        }
}
