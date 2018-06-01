package com.zakumi.HomeWork;

public class HomeWork20 {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
