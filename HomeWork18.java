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

